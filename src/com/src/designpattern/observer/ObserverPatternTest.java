package com.src.designpattern.observer;


public class ObserverPatternTest {

	public static void main(String[] args) {
		
		Student student = new Student();
		Home home = new Home();
		
		Loan loan = new Loan(10.0, "SBI");
		loan.registerObserver(home);
		loan.registerObserver(student);
		loan.setRate(11.2);

	}

}
