package com.src.designpattern.abstractfactory;

public class MySqlConnection implements Connection {

	@Override
	public void connect() {
		System.out.println("Connecting to MySql Database..");
	}

}
