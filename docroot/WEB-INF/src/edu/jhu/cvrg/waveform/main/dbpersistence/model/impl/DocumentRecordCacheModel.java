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

import edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DocumentRecord in entity cache.
 *
 * @author bbenite1
 * @see DocumentRecord
 * @generated
 */
public class DocumentRecordCacheModel implements CacheModel<DocumentRecord>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{RecordID=");
		sb.append(RecordID);
		sb.append(", RecordName=");
		sb.append(RecordName);
		sb.append(", UserID=");
		sb.append(UserID);
		sb.append(", SubjectID=");
		sb.append(SubjectID);
		sb.append(", OriginalFormat=");
		sb.append(OriginalFormat);
		sb.append(", SamplingRate=");
		sb.append(SamplingRate);
		sb.append(", FileTreePath=");
		sb.append(FileTreePath);
		sb.append(", LeadCount=");
		sb.append(LeadCount);
		sb.append(", NumberOfPoints=");
		sb.append(NumberOfPoints);
		sb.append(", DateOfUpload=");
		sb.append(DateOfUpload);
		sb.append(", Age=");
		sb.append(Age);
		sb.append(", Gender=");
		sb.append(Gender);
		sb.append(", DateOfRecording=");
		sb.append(DateOfRecording);
		sb.append(", AduGain=");
		sb.append(AduGain);
		sb.append("}");

		return sb.toString();
	}

	public DocumentRecord toEntityModel() {
		DocumentRecordImpl documentRecordImpl = new DocumentRecordImpl();

		if (RecordID == null) {
			documentRecordImpl.setRecordID(StringPool.BLANK);
		}
		else {
			documentRecordImpl.setRecordID(RecordID);
		}

		if (RecordName == null) {
			documentRecordImpl.setRecordName(StringPool.BLANK);
		}
		else {
			documentRecordImpl.setRecordName(RecordName);
		}

		if (UserID == null) {
			documentRecordImpl.setUserID(StringPool.BLANK);
		}
		else {
			documentRecordImpl.setUserID(UserID);
		}

		if (SubjectID == null) {
			documentRecordImpl.setSubjectID(StringPool.BLANK);
		}
		else {
			documentRecordImpl.setSubjectID(SubjectID);
		}

		if (OriginalFormat == null) {
			documentRecordImpl.setOriginalFormat(StringPool.BLANK);
		}
		else {
			documentRecordImpl.setOriginalFormat(OriginalFormat);
		}

		documentRecordImpl.setSamplingRate(SamplingRate);

		if (FileTreePath == null) {
			documentRecordImpl.setFileTreePath(StringPool.BLANK);
		}
		else {
			documentRecordImpl.setFileTreePath(FileTreePath);
		}

		documentRecordImpl.setLeadCount(LeadCount);
		documentRecordImpl.setNumberOfPoints(NumberOfPoints);

		if (DateOfUpload == Long.MIN_VALUE) {
			documentRecordImpl.setDateOfUpload(null);
		}
		else {
			documentRecordImpl.setDateOfUpload(new Date(DateOfUpload));
		}

		documentRecordImpl.setAge(Age);

		if (Gender == null) {
			documentRecordImpl.setGender(StringPool.BLANK);
		}
		else {
			documentRecordImpl.setGender(Gender);
		}

		if (DateOfRecording == Long.MIN_VALUE) {
			documentRecordImpl.setDateOfRecording(null);
		}
		else {
			documentRecordImpl.setDateOfRecording(new Date(DateOfRecording));
		}

		documentRecordImpl.setAduGain(AduGain);

		documentRecordImpl.resetOriginalValues();

		return documentRecordImpl;
	}

	public String RecordID;
	public String RecordName;
	public String UserID;
	public String SubjectID;
	public String OriginalFormat;
	public double SamplingRate;
	public String FileTreePath;
	public int LeadCount;
	public int NumberOfPoints;
	public long DateOfUpload;
	public int Age;
	public String Gender;
	public long DateOfRecording;
	public double AduGain;
}