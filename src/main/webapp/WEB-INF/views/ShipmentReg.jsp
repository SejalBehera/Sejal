<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head><body>
<h3>Shipment Type Register Page</h3>
<form:form action="save" mathod="POST" modelAttribute="shipmentType">
<pre>
Shipment Mode:
<form:select path="shipMode">
<form:option value="">--SELECT--</form:option>
<form:option value="Air">Air</form:option>
<form:option value="Truck">Truck</form:option>
<form:option value="Ship">Ship</form:option>
<form:option value="Train">Train</form:option>
</form:select>
Shipment Code:
<form:input path="shipCode"></form:input>
Enable Shipment:
<form:select path="enbShip">
<form:option value="">--SELECT--</form:option>
<form:option value="YES">YES</form:option>
<form:option value="NO">NO</form:option>
</form:select>
Shipment Grade:
<form:radiobutton path="shipGrade" value="A"/>A
<form:radiobutton path="shipGrade" value="B"/>B
<form:radiobutton path="shipGrade" value="C"/>C
Description:
<form:textarea path="shipDesc"/>
<input type="submit" value="create"/>
</pre>
</form:form>
${message}
</body>
</html>