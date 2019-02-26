package com.wbd.mall.common.util.format;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatHelper {
	
	private DateFormatHelper(){}
	private final static String FORMAT_STR = "yyyy-MM-dd HH:mm:ss";
	public static String long2str(long time){
		Date d = new Date(time);
		DateFormat df = new SimpleDateFormat(FORMAT_STR);
		return df.format(d);
		
	}
	public static long str2long(String str){
		DateFormat df = new SimpleDateFormat(FORMAT_STR);
		long time = 0;
		try {
			System.out.println(df.parse(str)+"---");
			time= df.parse(str).getTime();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return time;
	}
	
	public static void main(String[] args) {
		
		//当前日期(时间格式)转换为字符串 日期格式
		System.out.println(long2str(System.currentTimeMillis()));
		
		//将当前时间(字符串格式)转换为long类型
		System.out.println(str2long("2019-02-24 23:22:58"));
	}
}
