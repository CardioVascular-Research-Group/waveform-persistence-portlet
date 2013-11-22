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

package edu.jhu.cvrg.waveform.main.dbpersistence.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the UploadStatus service. Represents a row in the &quot;Database_UploadStatus&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link edu.jhu.cvrg.waveform.main.dbpersistence.model.impl.UploadStatusModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link edu.jhu.cvrg.waveform.main.dbpersistence.model.impl.UploadStatusImpl}.
 * </p>
 *
 * @author bbenite1
 * @see UploadStatus
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.model.impl.UploadStatusImpl
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.model.impl.UploadStatusModelImpl
 * @generated
 */
public interface UploadStatusModel extends BaseModel<UploadStatus> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a upload status model instance should use the {@link UploadStatus} interface instead.
	 */

	/**
	 * Returns the primary key of this upload status.
	 *
	 * @return the primary key of this upload status
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this upload status.
	 *
	 * @param primaryKey the primary key of this upload status
	 */
	public void setPrimaryKey(String primaryKey);

	/**
	 * Returns the status log number of this upload status.
	 *
	 * @return the status log number of this upload status
	 */
	@AutoEscape
	public String getStatusLogNumber();

	/**
	 * Sets the status log number of this upload status.
	 *
	 * @param StatusLogNumber the status log number of this upload status
	 */
	public void setStatusLogNumber(String StatusLogNumber);

	/**
	 * Returns the file transfer of this upload status.
	 *
	 * @return the file transfer of this upload status
	 */
	@AutoEscape
	public String getFileTransfer();

	/**
	 * Sets the file transfer of this upload status.
	 *
	 * @param FileTransfer the file transfer of this upload status
	 */
	public void setFileTransfer(String FileTransfer);

	/**
	 * Returns the file conversion of this upload status.
	 *
	 * @return the file conversion of this upload status
	 */
	@AutoEscape
	public String getFileConversion();

	/**
	 * Sets the file conversion of this upload status.
	 *
	 * @param FileConversion the file conversion of this upload status
	 */
	public void setFileConversion(String FileConversion);

	/**
	 * Returns the record creation of this upload status.
	 *
	 * @return the record creation of this upload status
	 */
	@AutoEscape
	public String getRecordCreation();

	/**
	 * Sets the record creation of this upload status.
	 *
	 * @param RecordCreation the record creation of this upload status
	 */
	public void setRecordCreation(String RecordCreation);

	/**
	 * Returns the annotation creation of this upload status.
	 *
	 * @return the annotation creation of this upload status
	 */
	@AutoEscape
	public String getAnnotationCreation();

	/**
	 * Sets the annotation creation of this upload status.
	 *
	 * @param AnnotationCreation the annotation creation of this upload status
	 */
	public void setAnnotationCreation(String AnnotationCreation);

	/**
	 * Returns the record i d of this upload status.
	 *
	 * @return the record i d of this upload status
	 */
	@AutoEscape
	public String getRecordID();

	/**
	 * Sets the record i d of this upload status.
	 *
	 * @param RecordID the record i d of this upload status
	 */
	public void setRecordID(String RecordID);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(UploadStatus uploadStatus);

	public int hashCode();

	public CacheModel<UploadStatus> toCacheModel();

	public UploadStatus toEscapedModel();

	public String toString();

	public String toXmlString();
}