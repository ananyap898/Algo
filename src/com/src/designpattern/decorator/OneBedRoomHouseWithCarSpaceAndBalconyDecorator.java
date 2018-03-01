package com.src.designpattern.decorator;

public class OneBedRoomHouseWithCarSpaceAndBalconyDecorator extends HouseDecorator {

	HouseComponent house;
	
	
	public OneBedRoomHouseWithCarSpaceAndBalconyDecorator(HouseComponent house) {
		super();
		this.house = house;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return house.getDescription() + " With One Car Space & Balcony";
	}

	@Override
	public double getPrice() {
		double modifiedPrice = house.getPrice() + 80000 + 10000;
		return modifiedPrice;
	}

}
