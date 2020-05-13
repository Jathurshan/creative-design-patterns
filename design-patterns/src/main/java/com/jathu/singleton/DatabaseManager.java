package com.jathu.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
	public static volatile DatabaseManager databaseManager;
	public static volatile Connection connection;

	private DatabaseManager() {
		if (databaseManager != null) {
			throw new RuntimeException("please get advantage of getDatabaseManager method..!");
		}
	}

	public static DatabaseManager getDatabaseManager() {

		if (databaseManager == null) {
			synchronized (DatabaseManager.class) {
				if (databaseManager == null) {
					databaseManager = new DatabaseManager();
				}
			}
		}
		return databaseManager;
	}

	public static Connection getDBConnection() {
		
		if(connection == null) {
			synchronized (Connection.class) {
				if(connection==null) {
					String url ="jdbc:derby:memory:sample;create=true";
					try {
						connection = DriverManager.getConnection(url);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		return connection;
	}
}
