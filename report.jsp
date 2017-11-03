<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reporting page</title>
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

 <p>  &nbspAre you an admin ? </p>
<form action="adminLogin.do" method="post">
<input type="hidden" name="adminlogin" ></label>
<button class="button button2">Login as Admin</button>
 </form>
 
<sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
         url = "jdbc:mysql://localhost:3306/userdb"
         user = "root"  password = "uncc"/>
         
<sql:query dataSource="${snapshot}" var="result">
SELECT * from userLogin;
</sql:query>

<table border="1" width="100%">
    <tr>
         <th>Username</th>
         <th>Password</th>

    </tr>
 

<c:forEach var="row" items="${result.rows}">
    <tr>
         <td><c:out value="${row.username}"/></td>
         <td><c:out value="${row.password}"/></td>
    </tr>
</c:forEach>
 </table>
</body>
</html>
