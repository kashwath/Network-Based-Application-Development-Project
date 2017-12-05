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
<%@ include file="Header.jsp" %>
<sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
         url = "jdbc:mysql://tiger.ceonkd3lm0ub.us-east-2.rds.amazonaws.com:3306/userdb"
         user = "kashwath"  password = "tigerlion"/>
         
<sql:query dataSource="${snapshot}" var="result">
SELECT * from money;
</sql:query>

<sql:query dataSource="${snapshot}" var="addition">
select sum(amount) as SUM from money;
</sql:query>



<table border="1" width="100%">
    <tr>
    	 <th>Date</th>
         <th>Name</th>
         <th>amount</th>
    </tr>
 

<c:forEach var="row" items="${result.rows}">
    <tr>
    	 <td><c:out value="${row.dateinformation}"/></td>
         <td><c:out value="${row.name}"/></td>
         <td><c:out value="${row.amount}"/></td>
    </tr>
</c:forEach>
 </table>
 
 <h3>The total donation till now is:  </h3> 
 <c:forEach var="row" items="${addition.rows}">
    <tr>
         $ <td><c:out value="${row.sum}"/></td>
    </tr>
</c:forEach>
 

 
 <%@ include file="Footer.jsp" %>
</body>
</html>