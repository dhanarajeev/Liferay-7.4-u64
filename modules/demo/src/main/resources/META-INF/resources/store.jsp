<%@ include file="/init.jsp" %> <%@ page language="java" contentType="text/html;
charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Store Page</title>
  </head>
  <body>
    <h2>Add the Store Details</h2>
    <form action="<portlet:actionURL />" method="post">
     Branch Name: <input type="text" name="branchName" /><br />
     Branch ID: <input type="text" name="branchId" /><br />
    Location: <input type="text" name="location" /><br />
     Contact Info: <input type="text" name="contactInfo" /><br />
</form>
</body>
</html>
