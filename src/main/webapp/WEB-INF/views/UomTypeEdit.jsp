<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<body>
<h3>Welcome to UomType Edit Page</h3>
<form:form action="update" method="POST" modelAttribute="uomType">
<pre>
UomType ID:
<form:input path="uomId" readOnly="true"/>
Uom Type:
<form:select path="uomType">
<form:option value="">--SELECT--</form:option>
<form:option value="PACKING">PACKING</form:option>
<form:option value="NOPACKING">NOPACKING</form:option>
<form:option value="NA">NA</form:option>
</form:select>
Uom Model
<form:input path="uomModel"></form:input>
Description:
<form:textarea path="uomDesc"/>
<input type="submit" value="Update"/>
</pre>
</form:form>
${message}
</body>
</html>