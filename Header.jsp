<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Header</title>
</head>
<body>
<div class="topnav" >

<% if (session.getAttribute("name") == null) { %>

<form class="one" action="index.do" method="post">
<input type="hidden"  name="login" > 
<button class="button button2">Login &nbsp</button>
</form>
<% } else {%>
<form class="one" action="login.do" method="get">
<input type="hidden"  name="login" > 
<button class="button button2">Homepage</button>
</form>

<% } %>



<form class="one" action="index.do" method="post">
<input type="hidden"  name="about" > 
<button class="button button2">How does it work?</button>
</form>

<form class="one" action="index.do" method="post">
<input type="hidden"  name="contact" > 
<button class="button button2"> Contact us</button>
</form>


  
 <a class= "plateful" href="index.do"> PLATEFUL</a>
</div>
</body>
</html>