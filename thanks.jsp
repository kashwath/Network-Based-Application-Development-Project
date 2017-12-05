<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="index.css" type="text/css" />
<title>Thanks for your donation</title>
<%@ include file="Header.jsp" %>
<%@ include file="logoutbutton.jsp" %>
</head>
<body>
<br/>
<br/>
<p class="two">Thanks for your donation. A confirmation email will be sent to your registered email address.<br/> <br/>
The food will be picked up from: <br> <br/> ${line1} <br/> ${line2}, <br> ${city}, ${state } , ${zipcode}, <br> ${country} </p>
</body>
</html>