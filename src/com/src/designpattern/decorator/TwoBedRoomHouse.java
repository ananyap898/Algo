package com.src.designpattern.decorator;

public class TwoBedRoomHouse extends HouseComponent {

	
	
	public TwoBedRoomHouse() {
		description = "Two Bed Room House";
	}

	@Override
	public double getPrice() {
		return 600000;
	}

}
