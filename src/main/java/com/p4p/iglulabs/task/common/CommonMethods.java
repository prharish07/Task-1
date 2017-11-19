package com.p4p.iglulabs.task.common;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonMethods {

	public static Date getCurrentDate()
	{
		//DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		
		return date;
		
	}
	public static String getCurrentTime()
	{
		//DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		String time=dateFormat.format(date).toString();
		
		
		return time;
		
	}
	
}
