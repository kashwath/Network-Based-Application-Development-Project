import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class loginDetails {
	
	//validate if the entered login information are valid
	public static boolean Validate(String name, String password) {
		
		boolean status=false;  
		try {
		    Class.forName("com.mysql.jdbc.Driver");
		} catch(ClassNotFoundException e) {
		    e.printStackTrace();
		}

		try {
			//connect to MySQL server via AWS server
		    String dbURL = "jdbc:mysql://tiger.ceonkd3lm0ub.us-east-2.rds.amazonaws.com:3306/userdb";
		    String username = "kashwath";
		    String password1 = "tigerlion";
		    Connection connection = DriverManager.getConnection(
		        dbURL, username, password1);
		    PreparedStatement ps=connection.prepareStatement(  
		    		"select HashedAndSaltedPassword from userLogin where emailAdddress=?");  
		    		ps.setString(1,name);  
		   		      
		    		ResultSet rs=ps.executeQuery();  
		    		while(rs.next()) {
		    			String HashedAndSaltedPassword=rs.getString(1);
			    		//compare hashed password in DB with hashed password entered by user
			    		String comparePassword= PasswordUtil.hashAndSaltPassword(password);
			    	
			    		//if they match, then it is the right password
			    		if(HashedAndSaltedPassword.equals(comparePassword)) {
			    		status=rs.next(); 
			    		connection.close();
			    		return true;
			    	}

		    		} 	
		    	

		}
		
		catch(SQLException e) {
		    for (Throwable t : e)
		        t.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		return status;
	}

	
	//add user data; used during signup
	public static boolean add(String name, String hashedPassword, String salt, String HashedAndSaltedPassword ) {
		
		boolean status=false; 
		try {
		    Class.forName("com.mysql.jdbc.Driver");
		} catch(ClassNotFoundException e) {
		    e.printStackTrace();
		}

		try {
		    String dbURL = "jdbc:mysql://tiger.ceonkd3lm0ub.us-east-2.rds.amazonaws.com:3306/userdb";
		    String username = "kashwath";
		    String password1 = "tigerlion";
		    Connection connection = DriverManager.getConnection(
		        dbURL, username, password1);
		    PreparedStatement ps=connection.prepareStatement(  
		    		"INSERT INTO userLogin " 
		    		+ "(emailAdddress, hashedPassword, salt, HashedAndSaltedPassword) "
		    		+ "VALUES "
		    		+ "(?, ?, ?, ?) "
		    );  
		    		ps.setString(1,name);  
		    		ps.setString(2,hashedPassword);  
		    		ps.setString(3,salt);  
		    		ps.setString(4,HashedAndSaltedPassword);  
		    		
		    		ps.executeUpdate();
		    		connection.close();
		    		return true;

		} catch(SQLException e) {
		    for (Throwable t : e)
		        t.printStackTrace();
		}


		return status;
	}

	//check if the entered login information is of an admin
	public static boolean adminLogin(String name, String password) {
		boolean status=false;  
		try {
		    Class.forName("com.mysql.jdbc.Driver");
		} catch(ClassNotFoundException e) {
		    e.printStackTrace();
		}

		try {
		    String dbURL = "jdbc:mysql://tiger.ceonkd3lm0ub.us-east-2.rds.amazonaws.com:3306/userdb";
		    String username = "kashwath";
		    String password1 = "tigerlion";
		    Connection connection = DriverManager.getConnection(
		        dbURL, username, password1);
		    PreparedStatement ps=connection.prepareStatement(  
		    		"select * from adminLogin where username=? and password=?");  
		    		ps.setString(1,name);  
		    		ps.setString(2,password);  
		    		      
		    		ResultSet rs=ps.executeQuery();  
		    		status=rs.next(); 
		    		connection.close();

		} catch(SQLException e) {
		    for (Throwable t : e)
		        t.printStackTrace();
		}

		return status;
	}
	
	
//adding address details to DB
public static boolean addAddress(String name,String line1, String line2, String city, String state, String zipcode, String country, String noofpeople) {
		
	boolean status=false; 
	try {
	    Class.forName("com.mysql.jdbc.Driver");
	} catch(ClassNotFoundException e) {
	    e.printStackTrace();
	}

	try {
	    String dbURL = "jdbc:mysql://tiger.ceonkd3lm0ub.us-east-2.rds.amazonaws.com:3306/userdb";
	    String username = "kashwath";
	    String password1 = "tigerlion";
	    Connection connection = DriverManager.getConnection(
	        dbURL, username, password1);
	    PreparedStatement ps=connection.prepareStatement(  
	    		"INSERT INTO address " 
	    		+ "( name, line1, line2,city,state,zipcode,country,noofpeople, dateinformation) "
	    		+ "VALUES "
	    		+ "(?, ?, ?, ?, ?, ?, ?, ?, ?) "
	    );  
	    		ps.setString(1,name);
	    		ps.setString(2,line1);  
	    		ps.setString(3,line2);  
	    		ps.setString(4,city); 
	    		ps.setString(5,state);  
	    		ps.setString(6,zipcode); 
	    		ps.setString(7,country);  
	    		ps.setString(8,noofpeople);
	    		
	    		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	    		LocalDate localDate = LocalDate.now();
	    		System.out.println(dtf.format(localDate));
	    		
	    		ps.setString(9,dtf.format(localDate));  
	    		ps.executeUpdate();
	    		connection.close();	
	    		

	} catch(SQLException e) {
	    for (Throwable t : e)
	        t.printStackTrace();
	}


	return status;
}

//add donated money information
public static boolean addMoney(String name, String amount) {
	
	boolean status=false; 
	try {
	    Class.forName("com.mysql.jdbc.Driver");
	} catch(ClassNotFoundException e) {
	    e.printStackTrace();
	}

	try {
	    String dbURL = "jdbc:mysql://tiger.ceonkd3lm0ub.us-east-2.rds.amazonaws.com:3306/userdb";
	    String username = "kashwath";
	    String password1 = "tigerlion";
	    Connection connection = DriverManager.getConnection(
	        dbURL, username, password1);
	    PreparedStatement ps=connection.prepareStatement(  
	    		"INSERT INTO money " 
	    		+ "( name, amount, dateinformation) "
	    		+ "VALUES "
	    		+ "(?, ?, ?) "
	    );  
	    		ps.setString(1,name);
	    		ps.setString(2,amount);
	    		
	    		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	    		LocalDate localDate = LocalDate.now();
	    		
	    		ps.setString(3,dtf.format(localDate)); 
	    		ps.executeUpdate();
	    		connection.close();	

	} catch(SQLException e) {
	    for (Throwable t : e)
	        t.printStackTrace();
	}


	return status;
	
}

}	
