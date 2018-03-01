package com.src.designpattern.observer;

public class Home implements Observer {

	@Override
	public void update(double rate) {
		System.out.println("Home Loan Rate -- " + rate);

	}

}
