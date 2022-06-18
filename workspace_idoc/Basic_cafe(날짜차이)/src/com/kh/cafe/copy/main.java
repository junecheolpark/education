package com.kh.cafe.copy;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class main {
	   public static void main(String[] args) throws ParseException {
	        String date1 = "2021/01/02"; //날짜1
	        String date2 = "2021/01/01"; //날짜2
	       
	        Date format1 = new SimpleDateFormat("yyyy/MM/dd").parse(date1);
	        Date format2 = new SimpleDateFormat("yyyy/MM/dd").parse(date2);
	        
	        long diffSec = (format1.getTime() - format2.getTime()) / 1000; //초 차이
	        long diffMin = (format1.getTime() - format2.getTime()) / 60000; //분 차이
	        long diffHor = (format1.getTime() - format2.getTime()) / 3600000; //시 차이
	        long diffDays = diffSec / (24*60*60); //일자수 차이
	        
	        System.out.println(diffSec + "초 차이");
	        System.out.println(diffMin + "분 차이");
	        System.out.println(diffHor + "시 차이");
	        System.out.println(diffDays + "일 차이");
	    }
}
