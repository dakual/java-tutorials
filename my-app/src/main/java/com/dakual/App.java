package com.dakual;

import java.text.SimpleDateFormat;
import java.util.Date;

public class App 
{
	public static void main(String args[]) {
        String pattern = "dd-MM-yyyy HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.println(date);
	}
}
