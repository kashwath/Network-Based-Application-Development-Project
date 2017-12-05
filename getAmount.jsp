<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome page</title>
<link rel="stylesheet" href="index.css" type="text/css" />
</head>
<body>
<%@ include file="Header.jsp" %>
<%@ include file="logoutbutton.jsp" %>

<form class= "two" action="final.do" method="get" >
<input type ="text" name="fullname" placeholder="Enter full name" required>
<input type ="text" name="amount" placeholder="Enter amount" required>
<button class="button button2">Confirm amount</button>
</form>


</body>
</html>