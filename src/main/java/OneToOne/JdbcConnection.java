package OneToOne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {

	
	public static void main(String[] args) throws SQLException {
		String dbUrl="jdbc:mysql://localhost:3306/world";
		String username="root";
		String password="Rajan@17s";
		
		Connection con=DriverManager.getConnection(dbUrl, username, password);
		System.out.println("Connected to db-->"+dbUrl);
	}
}
