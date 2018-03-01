package com.src.designpattern.observer;

public class Student implements Observer {

	@Override
	public void update(double rate) {
		System.out.println("Student Loan Rate -- " + rate);

	}

}
