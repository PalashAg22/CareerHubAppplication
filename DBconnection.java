package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.hexaware.util.PropertyUtil;

public class DBconnection {
public static Connection connection;

public  DBconnection() {
	
}
public static Connection getConnection() {
	if(connection == null) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String connectionString = PropertyUtil.getPropertyString();
			connection = DriverManager.getConnection(connectionString);
			//connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/career_hub","root","xxxx");
		}
		 catch (ClassNotFoundException | SQLException e) {
             e.printStackTrace();
             System.out.println("error...");
         }
	}
	return connection;
}
}


