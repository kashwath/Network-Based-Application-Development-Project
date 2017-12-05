<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="index.css" type="text/css" />
<title>Donate food</title>
<%@ include file="Header.jsp" %>
<%@ include file="logoutbutton.jsp" %>
</head>
<body>

<form class= "two" action="final.do" method="post" >
  <div class="row">
    <div class="col-md-4 col-md-offset-4">
        <fieldset>

          <!-- Form Name -->
          <legend>Food pick up address details</legend>
             
         

		 <!-- Text input-->
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Line 1</label>
            <div class="col-sm-10">
              <input type="text" placeholder="Full Name" name= "fullname" class="form-control" required>
            </div>
          </div>
          
          <!-- Text input-->
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Line 1</label>
            <div class="col-sm-10">
              <input type="text" placeholder="Address Line 1" name= "line1" class="form-control" required>
            </div>
          </div>

          <!-- Text input-->
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Line 2</label>
            <div class="col-sm-10">
              <input type="text" placeholder="Address Line 2" name= "line2" class="form-control">
            </div>
          </div>

          <!-- Text input-->
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">City</label>
            <div class="col-sm-10">
              <input type="text" placeholder="City" name= "city" class="form-control" required>
            </div>
          </div>

          <!-- Text input-->
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput" required>State</label>
            <div class="col-sm-4">
              <input type="text" placeholder="State" name= "state" class="form-control" required>
            </div>

            <label class="col-sm-2 control-label" for="textinput" required>Postcode</label>
            <div class="col-sm-4">
              <input type="text" placeholder="Post Code" name= "zipcode" class="form-control" required>
            </div>
          </div>



          <!-- Text input-->
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Country</label>
            <div class="col-sm-10">
              <input type="text" placeholder="Country" name= "country" class="form-control" required>
            </div>
          </div>
          
           <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">How many people can this feed?</label>
            <div class="col-sm-10">
              <input type="text" placeholder="Enter the approx. number" name= "noofpeople" class="form-control" required>
            </div>
          </div>

          <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
              <div class="pull-right">
                <button type="submit" class="btn btn-primary">Confirm pickup location</button>
              </div>
            </div>
          </div>

        </fieldset>
      </form>
    </div><!-- /.col-lg-12 -->
</div><!-- /.row -->


 </form>

</body>
</html>