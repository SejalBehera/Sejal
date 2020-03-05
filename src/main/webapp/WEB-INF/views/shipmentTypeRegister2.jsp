<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<body>
<h3>Welcome to Shipment Type Register Page</h3>
<form action="save" method="post">
<pre>
Shipment mode:
<select name="shipMode">
<option>----select-----</option>
<option>Air</option>
<option>Truck</option>
<option>Ship</option>
<option>Train</option>
</select>
Shipment code:
<input type="text" name="shipCode"/>
Enable Shipment:
<select name="enbShip">
<option>----select----</option>
<option>Yes</option>
<option>No</option></select>
Shipment Grade:
<input type="radio" name="shipGrade" value="A"/>A
<input type="radio" name="shipGrade" value="B"/>B
<input type="radio" name="shipGrade" value="C"/>C
Description:
<textarea name="shipDesc"></textarea>
<input type="submit" value="CREATE SHIPMENT"/>
</pre>
</form>
${message}
</body></html>