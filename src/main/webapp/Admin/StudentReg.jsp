<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>E-LIBRARY</title>
</head>
<body style="font-family: calibri">
<h2 align="center">E-LIBRARY</h2>
<br><br>
<h3 align="center">Student Registartion</h3>
<center>
<form method="post" action="StudentRegister">
Student ID: <input type="number" name="sid" required><br><br>
Full Name: <input type="text" name="sname" required><br><br>
Gender: 
Male<input type="radio" name="sgender" value="male" required>
Female<input type="radio" name="sgender" value="female" required><br><br>
Department: <input type="text" name="sdept" required><br><br>
Email: <input type="email" name="semail" required><br><br>
Mobile No.: <input type="number" name="smob" required><br><br>
Password: <input type="password" name="spwd" required><br><br>
<input type="submit" value="Register"  style="box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19); background-color: rgb(12,166,282); padding: 7px 25px; border: solid; border-radius: 10px">

</form>
</center>
</body>
</html>