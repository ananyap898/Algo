package com.src.designpattern.abstractfactory;

public class AbstractConnectionFactory {
	
	public static ConnectionFactory createFactory(String db){
		if(db.equalsIgnoreCase("oracle")){
			return new OracleConnectionFactory();
		}else if(db.equalsIgnoreCase("mysql")){
			return new MySqlConnectionFactory();
		}
		
		return null;
	}

}
