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

<a href="index.do"> Home Page</a>

<form action="index.do" method="post">
<input type="hidden"  name="signup"/>
<button class="button button2">Signup</button>
</form>

<form action="index.do" method="post">
<input type="hidden"  name="login" > 
<button class="button button2">Login &nbsp</button>
</form>
</br>
</br>
<p class="one">
Welcome ${name}

<p class="two">Select the report you want to run:</p>


<form action="reporting.do" method="post" >
<div id="mainselection">
  <select>
    <option>Select an Option</option>
    <option>User Data</option>
    <option>Money Data</option>
  </select>
</div>
<button class="button button2">Run</button>
</form>



</body>
</html>
