package com.src.designpattern.abstractfactory;

public class OracleConnectionFactory implements ConnectionFactory {

	@Override
	public Connection getConnection() {
		return new OracleConnection();
	}

}
