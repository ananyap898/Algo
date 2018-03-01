package com.src.designpattern.decorator;


/**
 * Abstract Component :HouseComponent
*  Concrete Component Class :OneBedRoomHouse
Abstract Decorator :AbstractHouseDecorator
Concrete Decorator Class :OneBedRoomHouseWithCarSpaceDecorator 
Concrete Decorator Class2 : OneBedRoomHouseWithSwimmingPoolDecorator
 * @author meethunpanda
 *
 */
public class DecoratorTest {

	public static void main(String[] args) {
		HouseComponent oneBedRoomHouse = new OneBedRoomHouse();
		HouseComponent twoBedRoomHouse = new TwoBedRoomHouse();
		
		System.out.println(oneBedRoomHouse.getDescription() + "  , Price " + oneBedRoomHouse.getPrice());
		System.out.println(twoBedRoomHouse.getDescription() + "  , Price " + twoBedRoomHouse.getPrice());
		
		HouseComponent decoratedHouse = new OneBedRoomHouseWithCarSpaceDecorator(oneBedRoomHouse);
		System.out.println(decoratedHouse.getDescription() + "  , Price " + decoratedHouse.getPrice());
		

		HouseComponent decoratedHouseWithBalcony = new OneBedRoomHouseWithCarSpaceAndBalconyDecorator(oneBedRoomHouse);
		System.out.println(decoratedHouseWithBalcony.getDescription() + "  , Price " + decoratedHouseWithBalcony.getPrice());
		
	}

}
