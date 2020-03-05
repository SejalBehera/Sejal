<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <html>
    <body>
    <h3> WELCOME TO SHIPMENT TYPE DATA PAGE</h3>
    
    <c:choose>
    <c:when test="${!empty list}">
    <table border="1">
    <tr>
    <th>ID</th>
     <th>MODE</th>
      <th>CODE</th>
       <th>ENABLE</th>
        <th>GRADE</th>
         <th>NOTE</th>
<!--            <th>DISPLAY -->
<!--            </th> -->
         </tr>
         
         <!-- for(shipmentType ob:list){} -->
         <c:forEach items="${list}" var="ob"> 
         <tr>
         <td>${ob.orderId}</td>
         <td>${ob.orderMode}</td>
         <td>${ob.orderCode}</td>
         <td>${ob.orderType}</td>
         <td>${ob.orderAcpt}</td>
         <td>${ob.description}</td>
         <td>
         <a href="delete?omid=${ob.orderId}">
         DELETE</a>
         <a href="edit?omid=${ob.orderId}">
         EDIT</a>
         
         </td>
         <td>
         <a href="view?omid=${ob.orderId }">VIEW</a>
         </td>
         
         </tr>
         </c:forEach>
         
    </table>
    </c:when>
    <c:otherwise>
    <h4>NO DATA FOUND!!</h4>
    </c:otherwise>
    </c:choose>
    </body></html>