package com.easylink;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AutomaticCar implements AutoFeatures {

	@Override
	public void SetDestination(String n, int h) {
		// TODO Auto-generated method stub
		Calendar cal= Calendar.getInstance();
		cal.add(Calendar.DATE, h);
		System.out.println("Your Destination is set to "+ n + "And your arrivale time is"+cal.getTime());
		//SimpleDateFormat format1=new SimpleDateFormat("yy-MM-dd");
		//String formatD=format1.format(cal.getTime());
		//System.out.println(formatD);
		
	}

	@Override
	public void Drive(int speed) {
		// TODO Auto-generated method stub
		System.out.println("YOur Speed is set to "+ speed);
	}

	@Override
	public void WakeUp() {
		// TODO Auto-generated method stub
		System.out.println("Wake Up Destination Arrived");
		
	}
	

}
