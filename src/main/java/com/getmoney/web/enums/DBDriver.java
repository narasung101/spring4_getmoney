package com.getmoney.web.enums;

public enum DBDriver {
	ORACLE_DRIVER,
	MYSQL_DRIVER,
	MARIADB_DRIVER;
	
	@Override
	public String toString() {
		String driver = "";
		switch(this) {
		case ORACLE_DRIVER:
			driver = "oracle.jdbc.OracleDriver";
			break;
		case MYSQL_DRIVER:
			driver = "com.mysql.jdbc.Driver";
			break;
		case MARIADB_DRIVER:
			driver = "com.mysql.jdbc.Driver";
			break;
		default: break;
		}
		return driver;
	}
}
