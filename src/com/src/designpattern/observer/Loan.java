package com.src.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Loan implements Subject {

	private List<Observer> observerList = new ArrayList<>();
	private double rate;
	private String bank;

	public Loan(double rate, String bank) {
		super();
		this.rate = rate;
		this.bank = bank;
	}

	

	public double getRate() {
		return rate;
	}

	public String getBank() {
		return this.bank;
	}
	
	public void setRate(double rate) {
		this.rate = rate;
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer ob) {
		if (!observerList.contains(ob)) {
			observerList.add(ob);
		}
	}

	@Override
	public void deRegisterObserver(Observer ob) {
		if (observerList.contains(ob)) {
			observerList.remove(ob);
		}

	}

	@Override
	public void notifyObservers() {
		for (Observer ob : observerList) {
			System.out.println("Notifying Observers on change in Loan interest rate");
			ob.update(this.rate);
		}

	}

}
