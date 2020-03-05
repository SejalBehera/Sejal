<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <html>
    <body>
    <h3> WELCOME TO PURCHASEORDER TYPE DATA PAGE</h3>
    
    <a href="excel">Excel Export</a>
     <a href="pdf">PDF Export</a>
     
    <c:choose>
    <c:when test="${!empty list}">
    <table border="1">
    <tr>
    <th>ID</th>
     <th>CODE</th>
      <th>REFNO</th>
       <th>QCHECK</th>
        <th>STATUS</th>
         <th>NOTE</th>
         
         <c:forEach items="${list}" var="ob"> 
         <tr>
         <td>${ob.pOrderId}</td>
         <td>${ob.pOrderCode}</td>
         <td>${ob.refNo}</td>
         <td>${ob.qaCheck}</td>
         <td>${ob.dStatus}</td>
         <td>${ob.desc}</td>
         <td>
         <a href="delete?poid=${ob.pOrderId}">
         DELETE</a>
         <a href="edit?poid=${ob.pOrderId}">
         EDIT</a>
         </td>
         <td>
         <a href="view?poid=${ob.pOrderId}">VIEW</a>
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