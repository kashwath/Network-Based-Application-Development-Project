import java.beans.Statement;
import java.sql.*;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.print.attribute.standard.PrinterLocation;

public class loginDetails {

	public static boolean Validate(String name, String password) {

		boolean status=false;
		System.out.println(name);
		System.out.println(password);
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

}
