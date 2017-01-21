package com.wangs.utils.utils;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtils {

	private static final SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static String getCurTime(Date date){
		return  sdf.format(date);
	}
	public static String getCurTime(){
		return sdf.format(Calendar.getInstance().getTime());
	}
}
