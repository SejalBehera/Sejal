<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<body>
<h3>Welcome to Uom Type Register Page</h3>
<form action="created" method="post">
<pre>
 Uom Type
<select name="uomType">
<option>----select-----</option>
<option>PACKING</option>
<option>NOPACKING</option>
<option>NA</option>
</select>
Uom Model
<input type="text" name="uomModel"/>
Description
<textarea name="uomDesc"></textarea>
<input type="submit" value="CREATE UOM"/>
</pre>
</form>
${msg}
</body></html>