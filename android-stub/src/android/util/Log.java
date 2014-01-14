/*
 * Copyright 2013 Martin Winandy
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package android.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Stub of the Android logging system (logcat).
 */
public final class Log {

	private static List<String> entries = new ArrayList<String>();

	private Log() {
	}

	/**
	 * Get and remove the current log entries.
	 * 
	 * @return Current log entries
	 */
	public static List<String> consumeEntries() {
		try {
			return entries;
		} finally {
			entries = new ArrayList<String>();
		}
	}

	/**
	 * Create a verbose log entry.
	 * 
	 * @param tag
	 *            Tag for the log entry
	 * @param message
	 *            Text message for the log entry
	 * @return Bytes to write
	 */
	public static int v(final String tag, final String message) {
		String entry = "V\t" + tag + "\t" + message;
		entries.add(entry);
		return entry.getBytes().length;
	}

	/**
	 * Create a verbose log entry.
	 * 
	 * @param tag
	 *            Tag for the log entry
	 * @param message
	 *            Text message for the log entry
	 * @param ex
	 *            Exception to log
	 * @return Bytes to write
	 */
	public static int v(final String tag, final String message, final Throwable ex) {
		String entry = "V\t" + tag + "\t" + message + "\t" + ex;
		entries.add(entry);
		return entry.getBytes().length;
	}

	/**
	 * Create a debug log entry.
	 * 
	 * @param tag
	 *            Tag for the log entry
	 * @param message
	 *            Text message for the log entry
	 * @return Bytes to write
	 */
	public static int d(final String tag, final String message) {
		String entry = "D\t" + tag + "\t" + message;
		entries.add(entry);
		return entry.getBytes().length;
	}

	/**
	 * Create a debug log entry.
	 * 
	 * @param tag
	 *            Tag for the log entry
	 * @param message
	 *            Text message for the log entry
	 * @param ex
	 *            Exception to log
	 * @return Bytes to write
	 */
	public static int d(final String tag, final String message, final Throwable ex) {
		String entry = "D\t" + tag + "\t" + message + "\t" + ex;
		entries.add(entry);
		return entry.getBytes().length;
	}

	/**
	 * Create an info log entry.
	 * 
	 * @param tag
	 *            Tag for the log entry
	 * @param message
	 *            Text message for the log entry
	 * @return Bytes to write
	 */
	public static int i(final String tag, final String message) {
		String entry = "I\t" + tag + "\t" + message;
		entries.add(entry);
		return entry.getBytes().length;
	}

	/**
	 * Create an info log entry.
	 * 
	 * @param tag
	 *            Tag for the log entry
	 * @param message
	 *            Text message for the log entry
	 * @param ex
	 *            Exception to log
	 * @return Bytes to write
	 */
	public static int i(final String tag, final String message, final Throwable ex) {
		String entry = "I\t" + tag + "\t" + message + "\t" + ex;
		entries.add(entry);
		return entry.getBytes().length;
	}

	/**
	 * Create a warning log entry.
	 * 
	 * @param tag
	 *            Tag for the log entry
	 * @param message
	 *            Text message for the log entry
	 * @return Bytes to write
	 */
	public static int w(final String tag, final String message) {
		String entry = "W\t" + tag + "\t" + message;
		entries.add(entry);
		return entry.getBytes().length;
	}

	/**
	 * Create a warning log entry.
	 * 
	 * @param tag
	 *            Tag for the log entry
	 * @param message
	 *            Text message for the log entry
	 * @param ex
	 *            Exception to log
	 * @return Bytes to write
	 */
	public static int w(final String tag, final String message, final Throwable ex) {
		String entry = "W\t" + tag + "\t" + message + "\t" + ex;
		entries.add(entry);
		return entry.getBytes().length;
	}

	/**
	 * Create an error log entry.
	 * 
	 * @param tag
	 *            Tag for the log entry
	 * @param message
	 *            Text message for the log entry
	 * @return Bytes to write
	 */
	public static int e(final String tag, final String message) {
		String entry = "E\t" + tag + "\t" + message;
		entries.add(entry);
		return entry.getBytes().length;
	}

	/**
	 * Create a warning log entry.
	 * 
	 * @param tag
	 *            Tag for the log entry
	 * @param message
	 *            Text message for the log entry
	 * @param ex
	 *            Exception to log
	 * @return Bytes to write
	 */
	public static int e(final String tag, final String message, final Throwable ex) {
		String entry = "E\t" + tag + "\t" + message + "\t" + ex;
		entries.add(entry);
		return entry.getBytes().length;
	}

}
