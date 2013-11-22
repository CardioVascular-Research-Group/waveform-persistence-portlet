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

import edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo;

import java.io.Serializable;

/**
 * The cache model class for representing FilesInfo in entity cache.
 *
 * @author bbenite1
 * @see FilesInfo
 * @generated
 */
public class FilesInfoCacheModel implements CacheModel<FilesInfo>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{DocumentID=");
		sb.append(DocumentID);
		sb.append(", FileListID=");
		sb.append(FileListID);
		sb.append("}");

		return sb.toString();
	}

	public FilesInfo toEntityModel() {
		FilesInfoImpl filesInfoImpl = new FilesInfoImpl();

		if (DocumentID == null) {
			filesInfoImpl.setDocumentID(StringPool.BLANK);
		}
		else {
			filesInfoImpl.setDocumentID(DocumentID);
		}

		if (FileListID == null) {
			filesInfoImpl.setFileListID(StringPool.BLANK);
		}
		else {
			filesInfoImpl.setFileListID(FileListID);
		}

		filesInfoImpl.resetOriginalValues();

		return filesInfoImpl;
	}

	public String DocumentID;
	public String FileListID;
}