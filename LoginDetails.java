import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class loginDetails {

	public static boolean Validate(String name, String password) {
		
		boolean status=false;  
		try {
		    Class.forName("com.mysql.jdbc.Driver");
		} catch(ClassNotFoundException e) {
		    e.printStackTrace();
		}

		try {
		    String dbURL = "jdbc:mysql://localhost:3306/userdb";
		    String username = "root";
		    String password1 = "uncc";
		    Connection connection = DriverManager.getConnection(
		        dbURL, username, password1);
		    System.out.println("DB connected");
		    PreparedStatement ps=connection.prepareStatement(  
		    		"select * from userLogin where username=? and password=?");  
		    		ps.setString(1,name);  
		    		ps.setString(2,password);  
		    		      
		    		ResultSet rs=ps.executeQuery();  
		    		status=rs.next(); 
		    		

		} catch(SQLException e) {
		    for (Throwable t : e)
		        t.printStackTrace();
		}

		return status;
	}

	public static boolean add(String name, String email, String password) {
		
		boolean status=false; 
		try {
		    Class.forName("com.mysql.jdbc.Driver");
		} catch(ClassNotFoundException e) {
		    e.printStackTrace();
		}

		try {
		    String dbURL = "jdbc:mysql://localhost:3306/userdb";
		    String username = "root";
		    String password1 = "uncc";
		    Connection connection = DriverManager.getConnection(
		        dbURL, username, password1);
		    System.out.println("DB connected");
		    PreparedStatement ps=connection.prepareStatement(  
		    		"INSERT INTO userLogin " 
		    		+ "(username, password) "
		    		+ "VALUES "
		    		+ "(?, ?) "
		    );  
		    		ps.setString(1,name);  
		    		ps.setString(2,password);  
		    		ps.executeUpdate();
		    		

		} catch(SQLException e) {
		    for (Throwable t : e)
		        t.printStackTrace();
		}


		return status;
	}


	public static boolean adminLogin(String name, String password) {
		boolean status=false;  
		try {
		    Class.forName("com.mysql.jdbc.Driver");
		} catch(ClassNotFoundException e) {
		    e.printStackTrace();
		}

		try {
		    String dbURL = "jdbc:mysql://localhost:3306/userdb";
		    String username = "root";
		    String password1 = "uncc";
		    Connection connection = DriverManager.getConnection(
		        dbURL, username, password1);
		    System.out.println("DB connected");
		    PreparedStatement ps=connection.prepareStatement(  
		    		"select * from adminlogin where username=? and password=?");  
		    		ps.setString(1,name);  
		    		ps.setString(2,password);  
		    		      
		    		ResultSet rs=ps.executeQuery();  
		    		status=rs.next(); 
		    		

		} catch(SQLException e) {
		    for (Throwable t : e)
		        t.printStackTrace();
		}

		return status;
	}

}	
