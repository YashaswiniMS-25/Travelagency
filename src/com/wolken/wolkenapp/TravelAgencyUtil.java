package com.wolken.wolkenapp;

import java.util.Scanner;

import com.wolken.wolkenapp.makemytrip.makeMyTrip;

public class TravelAgencyUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the booking vrl or srs");
		String s=scan.next();
		
		makeMyTrip mmt= TravelAgencyFactory.getCompany(s);
		boolean w=mmt.check();
		if(w) {
		if(mmt!=null) {
			
			System.out.println("enter no. of bookings");
			int no=scan.nextInt();
			
			mmt.acceptbooking(no);
			scan.close();
			
			
			
		}
		}
		else {
			System.out.println("no warranty");
		}
	

	}

}
