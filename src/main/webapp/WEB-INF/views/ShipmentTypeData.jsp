<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <html>
    <body>
    <h3> WELCOME TO SHIPMENT TYPE DATA PAGE</h3>
    
    <a href="excel"><img src="../resources/images/excel.png" width="30" height="30"/></a>
     <a href="pdf"><img src="../resources/images/pdf.png" width="30" height="30"/></a>
     
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
         <td>${ob.shipId}</td>
         <td>${ob.shipMode}</td>
         <td>${ob.shipCode}</td>
         <td>${ob.enbShip}</td>
         <td>${ob.shipGrade}</td>
         <td>${ob.shipDesc}</td>
         <td>
         <a href="delete?sid=${ob.shipId}">
         <img src="../resources/images/delete.jpg" width="30" height="30"/></a>
         <a href="edit?sid=${ob.shipId}">
         <img src="../resources/images/edit.jpg" width="30" height="30"/></a>
         </td>
         <td>
         <a href="view?sid=${ob.shipId }"><img src="../resources/images/view.png" width="30" height="30"/></a>
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