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

 <form action="adminLogin.do" method="post" >
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

</body>
</html>
