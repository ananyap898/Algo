package com.src.designpattern.abstractfactory;

public class AbstractConnectionFactoryTest {

	public static void main(String[] args) {
		
		ConnectionFactory factory = AbstractConnectionFactory.createFactory("mysql");
		factory.getConnection().connect();;
	}

}
