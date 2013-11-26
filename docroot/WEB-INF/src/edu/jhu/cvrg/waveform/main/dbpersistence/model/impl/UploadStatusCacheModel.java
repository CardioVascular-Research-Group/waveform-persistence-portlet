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

package edu.jhu.cvrg.waveform.main.dbpersistence.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus;

import java.io.Serializable;

/**
 * The cache model class for representing UploadStatus in entity cache.
 *
 * @author bbenite1
 * @see UploadStatus
 * @generated
 */
public class UploadStatusCacheModel implements CacheModel<UploadStatus>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{StatusLogNumber=");
		sb.append(StatusLogNumber);
		sb.append(", FileTransfer=");
		sb.append(FileTransfer);
		sb.append(", FileConversion=");
		sb.append(FileConversion);
		sb.append(", RecordCreation=");
		sb.append(RecordCreation);
		sb.append(", AnnotationCreation=");
		sb.append(AnnotationCreation);
		sb.append(", DocumentRecordID=");
		sb.append(DocumentRecordID);
		sb.append("}");

		return sb.toString();
	}

	public UploadStatus toEntityModel() {
		UploadStatusImpl uploadStatusImpl = new UploadStatusImpl();

		uploadStatusImpl.setStatusLogNumber(StatusLogNumber);

		if (FileTransfer == null) {
			uploadStatusImpl.setFileTransfer(StringPool.BLANK);
		}
		else {
			uploadStatusImpl.setFileTransfer(FileTransfer);
		}

		if (FileConversion == null) {
			uploadStatusImpl.setFileConversion(StringPool.BLANK);
		}
		else {
			uploadStatusImpl.setFileConversion(FileConversion);
		}

		if (RecordCreation == null) {
			uploadStatusImpl.setRecordCreation(StringPool.BLANK);
		}
		else {
			uploadStatusImpl.setRecordCreation(RecordCreation);
		}

		if (AnnotationCreation == null) {
			uploadStatusImpl.setAnnotationCreation(StringPool.BLANK);
		}
		else {
			uploadStatusImpl.setAnnotationCreation(AnnotationCreation);
		}

		uploadStatusImpl.setDocumentRecordID(DocumentRecordID);

		uploadStatusImpl.resetOriginalValues();

		return uploadStatusImpl;
	}

	public long StatusLogNumber;
	public String FileTransfer;
	public String FileConversion;
	public String RecordCreation;
	public String AnnotationCreation;
	public long DocumentRecordID;
}