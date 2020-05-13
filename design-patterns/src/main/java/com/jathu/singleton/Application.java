package com.jathu.singleton;

import java.sql.Connection;

public class Application {
	public static void main(String[] arg) {
		
		long start;
		long end;
		
		DatabaseManager databaseManager = DatabaseManager.getDatabaseManager();

		System.out.println(databaseManager);

		start = System.currentTimeMillis();
		Connection connection = DatabaseManager.getDBConnection();
		end = System.currentTimeMillis();
		
		System.out.println("Time duration for first connection" + (start - end));
		
		DatabaseManager databaseManager1 = DatabaseManager.getDatabaseManager();
		
		System.out.println(databaseManager1);
		
		start = System.currentTimeMillis();
		Connection connection1 = DatabaseManager.getDBConnection();
		end = System.currentTimeMillis();
		
		System.out.println("Time duration for second connection" + (start - end));
		
	}
}
