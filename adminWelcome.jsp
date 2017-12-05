<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Welcome page</title>
<link rel="stylesheet" href="index.css" type="text/css" />
</head>
<body>
<%@ include file="Header.jsp" %>
<%@ include file="logoutbutton.jsp" %>
<p class="one">
Welcome ${name}

<p class="two">Select the report you want to run:</p>


<form class= "two" action="reporting.do" method="get" >
<button class="button button2">User data</button>
</form>

<form class= "two" action="reporting.do" method="post" >
<button class="button button2">Money data</button>
</form>
<%@ include file="Footer.jsp" %>


</body>
</html>