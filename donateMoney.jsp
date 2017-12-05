<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Donate Money</title>

<link rel="stylesheet" href="style.css" type="text/css" />
<link rel="stylesheet" href="index.css" type="text/css" />
</head>
<body>
<%@ include file="Header.jsp" %>
<%@ include file="logoutbutton.jsp" %>
  <!-- heading starts here -->
<hgroup class="heading">
<h1 class="major">Donation Form </h1>
</hgroup> 
<!-- end heading -->

<!-- main content --> 

<form class="checkout" action="final2.do" method="post">
    <div class="checkout-header">
      <h1 class="checkout-title">
        Donate
        <span class="checkout-price"> $${amount}</span>
      </h1>
    </div>
    <p>
      <input type="text" class="checkout-input checkout-card" placeholder="4111 1111 1111 1111" required>
      <input type="text" class="checkout-input checkout-cvc" placeholder="CVC" required>
    </p>
    <p>
		<input type="text" class="checkout-input checkout-exp" placeholder="MM" autofocus required>
      <input type="text" class="checkout-input checkout-exp" placeholder="YY" required>
      
    </p>
    <p>
      <input type="submit" value="Donate" class="checkout-btn">
    </p>
  </form>

</body>
</html>