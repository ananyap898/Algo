package com.src.designpattern.decorator;

public abstract class HouseComponent {
	
	public String description = "Unknown House";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double getPrice();

}
