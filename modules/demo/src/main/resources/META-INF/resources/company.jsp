<%@ include file="/init.jsp" %> <%@ page language="java" contentType="text/html;
charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Company Page</title>
  </head>
  <body>
    <h2>Fill the Company Details</h2>
    <form action="<portlet:actionURL />" method="post">
     Company Name: <input type="text" name="companyName" /><br />
      Email: <input type="text" name="email" /><br />
      Phone Number: <input type="number" name="phoneNumber" /><br />
      Address: <input type="text" name="address" /><br />
      City: <input type="text" name="city" /><br />
      Pincode: <input type="number" name="pincode" /><br />
       Registration ID (CID): <input type="number" name="RegistrationID" /><br />
       Tax Id: <input type="number" name="taxId" /><br />
        GST: <input type="number" name="gst" /><br />
        <hr />
        <h2>Store Info</h2> <p>Do you have multiple Stores?</p>
         <input type="radio" name="storeOption" value="yes"> Yes
                <input type="radio" name="storeOption" value="no"> No
      <input type="submit" value="Register" />
    </form>




  </body>
</html>
