package com.src.designpattern.decorator;

public class OneBedRoomHouse extends HouseComponent {

	
	
	public OneBedRoomHouse() {
		description = "One Bed Room House";
	}

	@Override
	public double getPrice() {
		return 300000;
	}

}
