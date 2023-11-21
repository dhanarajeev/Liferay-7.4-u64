<html>
<body>
  <form action="<%= actionURL %>" method="post">
    <label for="firstName">First Name:</label>
    <input type="text" id="firstName" name="firstName" required>
    <label for="lastName">Last Name:</label>
    <input type="text" id="lastName" name="lastName" required>
    <label for="emailAddress">Email Address:</label>
        <input type="text" id="emailAddress" name="emailAddress" required>
        <label for="phoneNumber">Phone Number:</label>
        <input type="long" id="phoneNumber" name="phoneNumber" required>
        <label for="createPassword">Create Password:</label>
            <input type="text" id="createPassword" name="createPassword" required>
            <label for="conformPassword">Conform Password:</label>
            <input type="text" id="createPassword" name="createPassword" required>
            <label for="address">Address:</label>
                <input type="text" id="address" name="address" required>

    <input type="submit" value="Next (Company)">
  </form>
</body>
</html>
