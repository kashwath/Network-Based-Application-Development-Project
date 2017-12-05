<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Login page</title>
<link rel="stylesheet" href="index.css" type="text/css" />
</head>
<body>

<%@ include file="Header.jsp" %>
<%@ include file="logoutbutton.jsp" %>


 <form class= "one" action="adminLogin.do" method="post" >
  <div class="container">
    <label><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="name" required>

    <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>

    <div class="clearfix">
      <button type="button"  class="cancelbtn">Cancel</button>
      <button type="submit" class="signupbtn">Login</button>
    </div>
  </div>
</form>
<%@ include file="Footer.jsp" %>
</body>
</html>