<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>E-LIBRARY</title>
</head>
<body>
<h2>Login Here</h2>
<center>
<form method="post" action="IssueBook.jsp">
Lib ID: <input type="text" name="uname" required style="width: 40vh; height: 5vh; border-radius: 15px; border: solid; padding: 4px"><br><br>
Password: <input type="password" name="pwd" required style="width: 40vh; height: 5vh; border-radius: 15px; border: solid; padding: 4px"><br><br>
<input type="submit" value="Login" style="box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19); background-color: rgb(12,166,282); padding: 7px 25px; border: solid; border-radius: 10px">
</form>
</center>
</body>
</html>