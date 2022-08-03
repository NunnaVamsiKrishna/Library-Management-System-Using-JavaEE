<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>E-LIBRARY</title>
<link href="../css/SFines.css" rel="stylesheet" type="text/css">
</head>
<body>

    <div class="wrapper">
        <!--Top menu -->
        <div class="sidebar">
           <!--profile image & text-->
            <!--menu item-->
            <ul>
                <li>
                    <a href="StudentHome.jsp" class="active">
                        <span class="icon"><i class="fas fa-home"></i></span>
                        <span class="item">Home</span>
                    </a>
                </li>
                <li>
                    <a href="SearchBook.xhtml">
                        <span class="icon"><i class="fas fa-desktop"></i></span>
                        <span class="item">Find a book</span>
                    </a>
                </li>
                <li>
                    <a href="PlaceOrder.jsp">
                        <span class="icon"><i class="fas fa-user-friends"></i></span>
                        <span class="item">Place Order</span>
                    </a>
                </li>
                <li>
                    <a href="ViewOrders.jsp">
                        <span class="icon"><i class="fas fa-tachometer-alt"></i></span>
                        <span class="item">View Orders</span>
                    </a>
                </li>
                <li>
                    <a href="Fines.jsp">
                        <span class="icon"><i class="fas fa-database"></i></span>
                        <span class="item">Fines</span>
                    </a>
                </li>
                <li>
                    <a href="../index.jsp">
                        <span class="icon"><i class="fas fa-database"></i></span>
                        <span class="item">Logout</span>
                    </a>
                </li>
            </ul>
        </div>
        </div>
       
    </div>
    <div style="padding-left: 250px">
<center>
<h2>Place Order</h2>
<form method="post" action="StudentHome.jsp">
Book Name: <input type="text" name="fname" required><br><br>
Date: <input type="date" name="dateoforder" required><br><br>
Student ID: <input type="text" name="uname" required><br><br>
Version: <input type="password" name="pwd" required><br><br>
Return date: <input type="date" name="mob" required><br><br>
<input type="submit" value="Register"  style="box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19); background-color: rgb(12,166,282); padding: 7px 25px; border: solid; border-radius: 10px">
</center>
</form>
</div>
</body>
</html>