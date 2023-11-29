

import java.sql.*;


public class DBconnection {
	 public static final String url="jdbc:mysql://localhost:3306/busresv";
	 public static final String username="root";
	 public static final String password="Nisanaj@1303";
	 
	 public static Connection getConnection() throws SQLException{
		 return DriverManager.getConnection(url,username,password);
	 }
	 
}
