package com.src.designpattern.factory;

public class CurrencyFactory {
	
	public static Currency createCurrency(String country){
		
		
		
		if(country.equalsIgnoreCase("INDIA")){
			return new Rupee();
		}else if(country.equalsIgnoreCase("Canada")){
			return new CanadianDollar();
		}else if(country.equalsIgnoreCase("Usa")){
			return new USDollar();
		}
		
		
		return null;
	}

}
