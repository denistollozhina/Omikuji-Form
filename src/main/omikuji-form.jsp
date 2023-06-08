<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 6/8/2023
  Time: 4:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Omikuji Form</title>
</head>
<body>
<!DOCTYPE html>
<h1>Omikuji Form</h1>
<form action="${pageContext.request.contextPath}/omikuji" method="post">
    <label for="name">Your Name:</label>
    <input type="text" id="name" name="name" required>
    <br>
    <input type="submit" value="Send">
</form>

</body>
</html>
