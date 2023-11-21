<html>
<body>
  <form action="<%= actionURL %>" method="post">
    <label for="companyName">Company Name:</label>
    <input type="text" id="companyName" name="companyName" required>
    <label for="registrationId">Registration Id:</label>
    <input type="long" id="registrationId" name="registrationId" required>
    <label for="email">Email:</label>
    <input type="long" id="email" name="email" required>
    <label for="taxId">Tax Id:</label>
    <input type="long" id="taxId" name="taxId" required>
    <label for="phoneNumber">Phone Number:</label>
    <input type="long" id="phoneNumber" name="phoneNumber" required>
    <label for="gst">Gst:</label>
    <input type="long" id="gst" name="gst" required>
    <label for="address">Address:</label>
    <input type="text" id="address" name="address" required>
    <input type="submit" value="Next (Store)">
  </form>
</body>
</html>
