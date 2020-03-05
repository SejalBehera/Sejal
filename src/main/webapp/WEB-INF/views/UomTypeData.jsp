<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
    <h3> WELCOME TO UOMTYPE DATA PAGE</h3>
    
    <c:choose>
    <c:when test="${!empty list}">
    <table border="1">
    <tr>
    <th>ID</th>
     <th>TYPE</th>
      <th>MODEL</th>
        <th>NOTE</th>
         </tr>
         <!-- for(uomType ob:list){} -->
         <c:forEach items="${list}" var="ob"> 
         <tr>
         <td>${ob.uomId}</td>
         <td>${ob.uomType}</td>
         <td>${ob.uomModel}</td>
         <td>${ob.uomDesc}</td>
         <td>
         <a href="delete?uomid=${ob.uomId}">
         DELETE</a>
         </td>
         <td>
         <a href="edit?uomid=${ob.uomId}">
         EDIT</a>
         </td>
          </td>
         <td>
         <a href="view?uomid=${ob.uomId }">VIEW</a>
         </td>
         
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