package com.src.designpattern.factory;

public class FactoryTest {

	public static void main(String[] args) {
		Currency currency = CurrencyFactory.createCurrency("India");
		System.out.println(currency.getCcySymbol());

	}

}
