/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package edu.jhu.cvrg.waveform.main.dbpersistence.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfoClp;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.CoordinateClp;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecordClp;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfoClp;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatusClp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpSerializer {
	public static String getServletContextName() {
		if (Validator.isNotNull(_servletContextName)) {
			return _servletContextName;
		}

		synchronized (ClpSerializer.class) {
			if (Validator.isNotNull(_servletContextName)) {
				return _servletContextName;
			}

			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Class<?> portletPropsClass = classLoader.loadClass(
						"com.liferay.util.portlet.PortletProps");

				Method getMethod = portletPropsClass.getMethod("get",
						new Class<?>[] { String.class });

				String portletPropsServletContextName = (String)getMethod.invoke(null,
						"waveform-persistence-portlet-deployment-context");

				if (Validator.isNotNull(portletPropsServletContextName)) {
					_servletContextName = portletPropsServletContextName;
				}
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info(
						"Unable to locate deployment context from portlet properties");
				}
			}

			if (Validator.isNull(_servletContextName)) {
				try {
					String propsUtilServletContextName = PropsUtil.get(
							"waveform-persistence-portlet-deployment-context");

					if (Validator.isNotNull(propsUtilServletContextName)) {
						_servletContextName = propsUtilServletContextName;
					}
				}
				catch (Throwable t) {
					if (_log.isInfoEnabled()) {
						_log.info(
							"Unable to locate deployment context from portal properties");
					}
				}
			}

			if (Validator.isNull(_servletContextName)) {
				_servletContextName = "waveform-persistence-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(AnnotationInfoClp.class.getName())) {
			return translateInputAnnotationInfo(oldModel);
		}

		if (oldModelClassName.equals(CoordinateClp.class.getName())) {
			return translateInputCoordinate(oldModel);
		}

		if (oldModelClassName.equals(DocumentRecordClp.class.getName())) {
			return translateInputDocumentRecord(oldModel);
		}

		if (oldModelClassName.equals(FilesInfoClp.class.getName())) {
			return translateInputFilesInfo(oldModel);
		}

		if (oldModelClassName.equals(UploadStatusClp.class.getName())) {
			return translateInputUploadStatus(oldModel);
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInputAnnotationInfo(BaseModel<?> oldModel) {
		AnnotationInfoClp oldClpModel = (AnnotationInfoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getAnnotationInfoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCoordinate(BaseModel<?> oldModel) {
		CoordinateClp oldClpModel = (CoordinateClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCoordinateRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDocumentRecord(BaseModel<?> oldModel) {
		DocumentRecordClp oldClpModel = (DocumentRecordClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDocumentRecordRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputFilesInfo(BaseModel<?> oldModel) {
		FilesInfoClp oldClpModel = (FilesInfoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getFilesInfoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputUploadStatus(BaseModel<?> oldModel) {
		UploadStatusClp oldClpModel = (UploadStatusClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getUploadStatusRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					"edu.jhu.cvrg.waveform.main.dbpersistence.model.impl.AnnotationInfoImpl")) {
			return translateOutputAnnotationInfo(oldModel);
		}

		if (oldModelClassName.equals(
					"edu.jhu.cvrg.waveform.main.dbpersistence.model.impl.CoordinateImpl")) {
			return translateOutputCoordinate(oldModel);
		}

		if (oldModelClassName.equals(
					"edu.jhu.cvrg.waveform.main.dbpersistence.model.impl.DocumentRecordImpl")) {
			return translateOutputDocumentRecord(oldModel);
		}

		if (oldModelClassName.equals(
					"edu.jhu.cvrg.waveform.main.dbpersistence.model.impl.FilesInfoImpl")) {
			return translateOutputFilesInfo(oldModel);
		}

		if (oldModelClassName.equals(
					"edu.jhu.cvrg.waveform.main.dbpersistence.model.impl.UploadStatusImpl")) {
			return translateOutputUploadStatus(oldModel);
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Throwable translateThrowable(Throwable throwable) {
		if (_useReflectionToTranslateThrowable) {
			try {
				UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

				objectOutputStream.writeObject(throwable);

				objectOutputStream.flush();
				objectOutputStream.close();

				UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
						0, unsyncByteArrayOutputStream.size());

				Thread currentThread = Thread.currentThread();

				ClassLoader contextClassLoader = currentThread.getContextClassLoader();

				ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
						contextClassLoader);

				throwable = (Throwable)objectInputStream.readObject();

				objectInputStream.close();

				return throwable;
			}
			catch (SecurityException se) {
				if (_log.isInfoEnabled()) {
					_log.info("Do not use reflection to translate throwable");
				}

				_useReflectionToTranslateThrowable = false;
			}
			catch (Throwable throwable2) {
				_log.error(throwable2, throwable2);

				return throwable2;
			}
		}

		Class<?> clazz = throwable.getClass();

		String className = clazz.getName();

		if (className.equals(PortalException.class.getName())) {
			return new PortalException();
		}

		if (className.equals(SystemException.class.getName())) {
			return new SystemException();
		}

		if (className.equals(
					"edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException")) {
			return new edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException();
		}

		if (className.equals(
					"edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchCoordinateException")) {
			return new edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchCoordinateException();
		}

		if (className.equals(
					"edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException")) {
			return new edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException();
		}

		if (className.equals(
					"edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException")) {
			return new edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException();
		}

		if (className.equals(
					"edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchUploadStatusException")) {
			return new edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchUploadStatusException();
		}

		return throwable;
	}

	public static Object translateOutputAnnotationInfo(BaseModel<?> oldModel) {
		AnnotationInfoClp newModel = new AnnotationInfoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setAnnotationInfoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCoordinate(BaseModel<?> oldModel) {
		CoordinateClp newModel = new CoordinateClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCoordinateRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDocumentRecord(BaseModel<?> oldModel) {
		DocumentRecordClp newModel = new DocumentRecordClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDocumentRecordRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputFilesInfo(BaseModel<?> oldModel) {
		FilesInfoClp newModel = new FilesInfoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setFilesInfoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputUploadStatus(BaseModel<?> oldModel) {
		UploadStatusClp newModel = new UploadStatusClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setUploadStatusRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}