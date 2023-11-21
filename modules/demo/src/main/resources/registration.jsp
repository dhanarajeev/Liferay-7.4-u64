
<!DOCTYPE html>
<html>
  <head>
    <title>Registration Page</title>
  </head>
  <body>
    <h2>Fill the Registration Form</h2>
    <form action="< portlet:actionURL name='PersonalInfoPortlet' />" method="post">
      First Name: <input type="text" name="firstName" /><br />
      Last Name: <input type="text" name="lastName" /><br />
      Email Address: <input type="text" name="emailAddress" /><br />
      Phone Number: <input type="number" name="phoneNumber" /><br />
      Create Password: <input type="text" name="createPassword" /><br />
      Confirm Password: <input type="text" name="confirmPassword" /><br />
      Address: <input type="text" name="address" />
</form>

    <hr />
      <h2> Are you Owner? </h2>
       <form action="<portlet:renderURL />/goto_company" method="post">
      <input type="radio" name="storeOption" value="yes" onclick="handleStoreOption('yes')"> Yes
                      <input type="radio" name="storeOption" value="no" onclick="handleStoreOption('no')"> No
     <div id="employeeId" style="display: none;">
     <label>Employee Id:</label>
     <input type="number" name="Employee Id">
     </div>
 <button type="submit"><a href="/company.jsp">Next</a></button>
   <!-- <a href="<portlet:renderURL><portlet:param name='jspPage' value='/company.jsp' /></portlet:renderURL>">Company Info</a> -->
  </body>
</html>
<script>
        function handleStoreOption(option) {
            var storeField = document.getElementById("employeeId");

            if (option === 'yes') {
                employeeId.style.display = 'none';
            } else {
                employeeId.style.display = 'block';
            }
        }
    </script>
