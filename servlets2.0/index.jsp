<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="calc.jsp" method="POST">
<table border="1">
<thead>
<tr>
<th colspan="2">calculator</th>
</tr>
</thead>
<tbody>
<tr>
<td><input type="radio" name="r1" id="add" value="add">+</td>
</tr>
<tr>
<td><input type="radio" name="r1" id="sub" value="sub">-</td>
</tr>
<tr>
<td><input type="radio" name="r1" id="mul" value="mul">*</td>
</tr>
<tr>
<td><input type="radio" name="r1" id="div" value="div">/</td>
</tr>
<tr>
<td>Number1</td>
<td><input type="text" name="a" id="a" /></td>
</tr>
<tr>
<td>Number2</td>
<td><input type="text" name="b" id="b" /></td>
</tr>
<tr>
<td colspan="2"><input type="submit" name="submit" value="submit" /></td>
</tr>
</tbody>
</table>
</form>
</body>
</html>