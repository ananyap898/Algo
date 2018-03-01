package com.src.designpattern.observer;

public interface Subject {
	
	public void registerObserver(Observer ob);
	
	public void deRegisterObserver(Observer ob);
	
	public void notifyObservers();

}
