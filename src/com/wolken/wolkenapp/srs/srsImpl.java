package com.wolken.wolkenapp.srs;

import com.wolken.wolkenapp.makemytrip.makeMyTrip;

public class srsImpl  implements makeMyTrip{

	@Override
	public void acceptbooking(int numb) {
		if(numb>10) {
		// TODO Auto-generated method stub
		System.out.println(" srs booking confirmed");
		}
		else {
			System.out.println("sry failed!!!");
		}

		
		
	}

	@Override
	public boolean check() {
		// TODO Auto-generated method stub
		return false;
	}

}
