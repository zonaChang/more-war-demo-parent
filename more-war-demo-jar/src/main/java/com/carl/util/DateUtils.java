package com.carl.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Desc: 
 * @Auth: Carl
 * @Time: 2017年12月9日 下午4:56:23
 */
public class DateUtils {

	private static final String CURRENT_TIME_PATTERN = "yyyyMMddHHmmss";
	
	public static String getCurrentTime() {
		return new SimpleDateFormat(CURRENT_TIME_PATTERN).format(new Date());
	}
	
	public static void main(String[] args) {
		System.out.println(getCurrentTime());
	}
}
