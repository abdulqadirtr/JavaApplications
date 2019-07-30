package com.easylink;

import java.awt.List;
import java.util.Scanner;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class MainClass  {

	public static void main(String args[]) {
		
	
		Calendar cal= Calendar.getInstance();
		cal.add(Calendar.DATE, 1000);
		System.out.println(cal.getTime());
		SimpleDateFormat format1=new SimpleDateFormat("yy-MM-dd");
		String formatD=format1.format(cal.getTime());
		System.out.println(formatD);
		//MainClass m=new MainClass();
		 
		
		AutomaticCar car= new AutomaticCar();
		String destinationName;
		int hourDistance;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter Your destination");
		destinationName=sc.nextLine();
		
		System.out.println("Please Enter Your Time");
		hourDistance=sc.nextInt();
		
		
		
		car.SetDestination(destinationName, hourDistance);
	
	}

}
