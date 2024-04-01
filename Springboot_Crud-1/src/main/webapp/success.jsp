<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="x"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
 centre{
    text-align:center;
    font-size:20px;
    border:4 px solid black;
    padding:8px;
 }
.btn{
text-align:center;
    font-size:16px;
    width:100px;
    padding:8px;
    margin:40px;
}

</style>

<script type = "text/javascript">
function addUser()
{
	document.fn.action ="Register";//<form action=register>
	document.fn.submit();
}

function deleteUser()
{
	document.fn.action ="delete";
	document.fn.submit();
}
	
function editUser()
{
	document.fn.action ="edit";
	document.fn.submit();
	
}
</script>
</head>
<body>
<center><h1>Display Data</h1></center>
<div style = "display: flex; text-align: centre; justify-content:center;">
<form name="fn">

<table border : 1 px solid black align = "center" style = "border-collapse:collapse;" >
<tr>
 <th>Sr No</th>
<th>Userid</th>
<th>Username</th>
<th>Password</th>
<th>Mobno</th>
<th>Email</th>
</tr>
<x:forEach items="${data}" var="user">
<br>
<tr>
<td><input type="radio" name="uid" value="${user.uid}"></td>
<td>${user.uid}</td>
<td>${user.uname}</td>
<td>${user.password}</td> 
<td> ${user.mobno}</td>
<td> ${user.email}</td> 
</tr> 
 </x:forEach>
  </table>
 
<table border="2" style="text-align:center">
<tr>
<td><input type="button" value="EDIT" onclick="editUser()"></td>
<td><input type="button" value="ADD" onclick="addUser()"></td>
<td><input type="button" value="DELETE" onclick="deleteUser()"></td>

</tr>
</table>
	</form>
	</div>
</body>
</html>