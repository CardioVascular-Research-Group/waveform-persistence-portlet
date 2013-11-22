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

package edu.jhu.cvrg.waveform.main.dbpersistence.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import edu.jhu.cvrg.waveform.main.dbpersistence.service.AnnotationInfoLocalServiceUtil;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.AnnotationInfoServiceUtil;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.ClpSerializer;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.CoordinateLocalServiceUtil;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.CoordinateServiceUtil;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.DocumentRecordLocalServiceUtil;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.DocumentRecordServiceUtil;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.FilesInfoLocalServiceUtil;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.FilesInfoServiceUtil;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.UploadStatusLocalServiceUtil;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.UploadStatusServiceUtil;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			AnnotationInfoLocalServiceUtil.clearService();

			AnnotationInfoServiceUtil.clearService();
			CoordinateLocalServiceUtil.clearService();

			CoordinateServiceUtil.clearService();
			DocumentRecordLocalServiceUtil.clearService();

			DocumentRecordServiceUtil.clearService();
			FilesInfoLocalServiceUtil.clearService();

			FilesInfoServiceUtil.clearService();
			UploadStatusLocalServiceUtil.clearService();

			UploadStatusServiceUtil.clearService();
		}
	}
}