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

package edu.jhu.cvrg.waveform.main.dbpersistence;

import com.liferay.portal.NoSuchModelException;

/**
 * @author bbenite1
 */
public class NoSuchDocumentRecordException extends NoSuchModelException {

	public NoSuchDocumentRecordException() {
		super();
	}

	public NoSuchDocumentRecordException(String msg) {
		super(msg);
	}

	public NoSuchDocumentRecordException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NoSuchDocumentRecordException(Throwable cause) {
		super(cause);
	}

}