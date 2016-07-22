package tsm02_J_CSSNBT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionFactory { 
	private static Connection dbConnection; // Other fields ...

	static {
		// Initialize a database connection 
		try {
		dbConnection = DriverManager.getConnection("connection string"); 
		} catch (SQLException e) {
			dbConnection = null; 
		}
		// Other initialization (do not start any threads) 
	}
// ...
	public static Connection getConnection() { 
		if (dbConnection == null) {
			throw new IllegalStateException("Error initializing connection"); 
			}
		return dbConnection; 
		}
	
	public static void main(String[] args) { 
		// ...
		Connection connection = getConnection(); 
	}
}
