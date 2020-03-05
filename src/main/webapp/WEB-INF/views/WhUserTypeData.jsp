<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>WELCOME TO WHUser TYPE DATA PAGE</h3>

	<c:choose>
		<c:when test="${!empty list}">
			<table border="1">
				<tr>
					<th>ID</th>
					<th>TYPE</th>
					<th>CODE</th>
					<th>FOR</th>
					<th>EMAIL</th>
					<th>CONTACT</th>
					<th>IDTYPE</th>
					<th>OTHER</th>
					<th>IDNO</th>
				</tr>

				<!-- for(shipmentType ob:list){} -->
				<c:forEach items="${list}" var="ob">
					<tr>
						<td>${ob.whuId}</td>
						<td>${ob.whuType}</td>
						<td>${ob.whuCode}</td>
						<td>${ob.whuFor}</td>
						<td>${ob.whuEmail}</td>
						<td>${ob.whuCntct}</td>
						<td>${ob.whuIdType}</td>
						<td>${ob.whuOther}</td>
						<td>${ob.whuIdNo}</td>
						<td><a href="delete?whuid=${ob.whuId}"> DELETE</a></td>

					</tr>
				</c:forEach>

			</table>
		</c:when>
		<c:otherwise>
			<h4>NO DATA FOUND!!</h4>
		</c:otherwise>
	</c:choose>

</body>
</html>