package com.nubes.internship.Instrument;

public class Guitar implements Instrument {

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return "Guitar is playing tin tin tin tin";
	}

	@Override
	public String toString() {
		return "[" + play() + "]";
	}

}
