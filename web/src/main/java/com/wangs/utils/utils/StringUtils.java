package com.wangs.utils.utils;

public class StringUtils {

	public static boolean isEmpty(String str){
		return null==str||"".equals(str);
	}
	public static boolean isNotEmpty(String str){
		return null!=str&&!str.equals("");
	}
}
