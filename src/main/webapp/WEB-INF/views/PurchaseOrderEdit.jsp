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
<h3>Welcome to PurchaseOrder Edit Page</h3>
<form:form action="update" method="POST" modelAttribute="purchaseOrder">
<pre>
PurchaseOrder ID:
<form:input path="pOrderId" readOnly="true"/>
PurchaseOrder Code:
<form:input path="pOrderCode"></form:input>
Ref No:
<form:input path="refNo"></form:input>
Qality Check:
<form:radiobutton path="qaCheck" value="Required"/>Required
<form:radiobutton path="qaCheck" value="NotRequired"/>NotRequired
Default Status:
<form:input path="dStatus" value="OPEN" readOnly="true"/>
Description:
<form:textarea path="desc"/>
<input type="submit" value="create"/>
</pre>
</form:form>
${message}
</body>
</html>