<html>
<body>
  <form action="<%= actionURL %>" method="post">
    <label for="branchId">Branch Id:</label>
    <input type="long" id="branchId" name="branchId" required>
    <label for="branchName">Branch Name:</label>
    <input type="long" id="branchName" name="branchName" required>
    <label for="address">Address:</label>
    <input type="text" id="address" name="address" required>
    <label for="contactNumber">Contact Number:</label>
    <input type="long" id="contactNumber" name="contactNumber" required>
    <input type="submit" value="Submit">
  </form>
</body>
</html>
