<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="index.css" type="text/css" />
<title>About us</title>
</head>
<body>
<%@ include file="Header.jsp" %>
<%@ include file="logoutbutton.jsp" %>
<div>
<h4>Plateful is an excess food collection and donation website. Users can log in to the site and place a request to pick up the food. The food will be donated to the people who are in need.
Alternatively, users can also give their money, which will be used to buy food for the needy people</h4>
<h3>Plateful works like this in a practical scenario-</h3>

<h3>Food donation</h3>
<ol class="c">
  <li>Users log in to the website.</li>
  <li>The user places a request for the pickup of their food. Food can be picked up from the cafes, restaurant, homes, schools, etc.</li>
  <li>A person from Plateful will come and pick up the order.</li>
  <li>A notification email/SMS is sent to the customer.</li>
  <li>Finally, the picked up food will be donated.</li>

</ol>

<h3>Money donation</h3>
<ol class="c">

  <li>Users log in to the website.</li>
  <li>Chooses amount and payment option to donate.</li>
  <li>The payment is processed, and payment is sent to Plateful.</li>
  <li>A notification email/SMS is sent to customer about successful donation</li>
  
</ol>
</div>
<%@ include file="Footer.jsp" %>
</body>
</html>