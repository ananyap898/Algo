package com.src.designpattern.abstractfactory;

public class OracleConnection implements Connection {

	@Override
	public void connect() {
		System.out.println("Connecting to Oracle Database..");
	}

}
