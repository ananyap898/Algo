package com.src.designpattern.decorator;

public class OneBedRoomHouseWithCarSpaceDecorator extends HouseDecorator {

	HouseComponent house;
	
	
	public OneBedRoomHouseWithCarSpaceDecorator(HouseComponent house) {
		super();
		this.house = house;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return house.getDescription() + " With One Car Space";
	}

	@Override
	public double getPrice() {
		double modifiedPrice = house.getPrice() + 80000;
		return modifiedPrice;
	}

}
