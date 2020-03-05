<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>WELCOME TO PURCHASEORDER TYPE VIEW PAGE</h3>
<table border="1">
<tr>
<th>ID</th><td>${ob.pOrderId }</td>
</tr>
<tr>
<th>CODE</th><td>${ob.pOrderCode}</td>
</tr>
<tr>
<th>REFNO</th><td>${ob.refNo}</td>
</tr>
<tr>
<th>CHECK</th><td>${ob.qaCheck}</td>
</tr>
<tr>
<th>STATUS</th><td>${ob.dStatus}</td>
</tr>
<tr>
<th>DESC</th><td>${ob.desc}</td>
</tr>
</table>
<a href="excel?id=${ob.pOrderId}">Excel Export</a>
<a href="pdf?id=${ob.pOrderId}">Pdf Export</a>

</body>
</html>
