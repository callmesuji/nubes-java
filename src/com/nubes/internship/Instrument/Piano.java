package com.nubes.internship.Instrument;

public class Piano implements Instrument {

	@Override
	public String play() {
		return "Piano is playing pee peee peee ";
	}

	@Override
	public String toString() {
		return "[" + play() + "]";
	}

}
