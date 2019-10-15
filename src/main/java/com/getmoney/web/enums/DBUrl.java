package com.getmoney.web.enums;

public enum DBUrl {
	ORACLE_URL,
	MYSQL_URL,
	MARIADB_URL;
	
	@Override
	public String toString() {
		String url = "";
		switch(this) {
		case ORACLE_URL:
			url = "jdbc:oracle:thin:@localhost:1521:xe";
			break;
		case MYSQL_URL:
			url = "jdbc:mysql://localhost/dev";
			break;
		case MARIADB_URL:
			url = "jdbc:mariadb://localhost:3306";
			break;
		}
		return url;
	}
}
