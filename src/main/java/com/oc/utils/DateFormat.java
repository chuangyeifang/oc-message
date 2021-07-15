/**
 * 
 */
package com.oc.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description:
 * @author chuangyeifang
 * @createDate 2019年11月13日
 * @version v 1.0
 */
public class DateFormat {

	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public synchronized static String getStringDate(Date date) {
		return format.format(date);
	}
}
