<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="index.css" type="text/css" />
<title>Plateful</title>
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

 <p>  &nbspAre you an admin ? </p>
<form action="adminLogin.do" method="post">
<input type="hidden" name="adminlogin" ></label>
<button class="button button2">Login as Admin</button>
 </form>

<p class="one">Plateful</p>

<p class="one"> Your food is too valuable to be wasted. So feed the community.</p>

<p class="three">Login to continue.</p>


</body>
</html>
