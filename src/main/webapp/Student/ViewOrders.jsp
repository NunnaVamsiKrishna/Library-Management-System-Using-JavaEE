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
                    <a href="index.jsp" class="active">
                        <span class="icon"><i class="fas fa-home"></i></span>
                        <span class="item">Home</span>
                    </a>
                </li>
                <li>
                    <a href="SearchBook.jsp">
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
       
    <div style="padding-left: 250px">
<center>
<table border="2" style="border: solid blue; background-color: cyan">
<tr>
<th style="padding: 10px 50px">Time & Date</th>
<th style="padding: 10px 50px">Book ID</th>
<th style="padding: 10px 50px">Book Name</th>
<th style="padding: 10px 50px">Book Edition</th>
<th style="padding: 10px 50px">Return</th>
<th style="padding: 10px 50px">Fine</th>
</tr>

</table>
</center>
</div>
</body>
</html>