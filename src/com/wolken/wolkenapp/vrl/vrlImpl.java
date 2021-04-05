package com.wolken.wolkenapp.vrl;

import com.wolken.wolkenapp.makemytrip.makeMyTrip;

public class vrlImpl implements makeMyTrip{

	@Override
	public void acceptbooking(int numb) {
		// TODO Auto-generated method stub
		if(numb>10) {
		System.out.println("vrl booking confirmed");
		}
		else {
			System.out.println("sry failed!!!");
		}
	}

	@Override
	public boolean check() {
		// TODO Auto-generated method stub
		return true;
	}

}
