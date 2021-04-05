package com.wolken.wolkenapp;

import com.wolken.wolkenapp.makemytrip.makeMyTrip;
import com.wolken.wolkenapp.srs.srsImpl;
import com.wolken.wolkenapp.vrl.vrlImpl;

public class TravelAgencyFactory {
	public static makeMyTrip getCompany(String s) {
		if(s.equalsIgnoreCase("srs")) {
			return new srsImpl();
		}
		else if(s.equalsIgnoreCase("vrl")) {
			return new vrlImpl();
		}
		else {
			System.out.println("not found");
		}
		return null;
	}

}
