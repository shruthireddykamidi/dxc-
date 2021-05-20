<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.util.*" %>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 90%;
  table-layout:fixed;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>
<table>
  <tr>
    <th>Product Name</th>
    <th>Price</th>
    <th>Qty</th>
    <th>Total</th>
  </tr>
</table>
<%
String bill = request.getParameter("bill");
String mob = request.getParameter("mobile");
mob = "customer"+mob;
//String mob  = "customer4";
//String arr[] = new String[100];
String arr[] = bill.split(" ");/* 
for(String i:arr){
	out.println(i);
}
 */
	String url="jdbc:mysql://localhost:3306/codejavadb";
    String db = "codejavadb";
	String username="root";
	String password="Manesh@99";
	int result = 0;
	double temp = 0;
	java.sql.Connection con = null;
	//Connection connection = DriverManager.getConnection(url,username,password);
 try {
	    
	    //Class.forName("mysql-connector-java-8.0.25.jar");
	    Class.forName("com.mysql.jdbc.Driver").newInstance(); 
	    //con = DriverManager.getConnection("jdbc:mysql://localhost/"+db, username,password);
	    con = DriverManager.getConnection(url,username,password);
	    //out.println (db+ "database successfully opened.");
	  }
	  catch(SQLException e) {
	    out.println("SQLException caught: " +e.getMessage());
	  }
 
 java.sql.PreparedStatement statement;
 try{
 	String sq = "create table if not exists "+mob+"  ("
 			  +"  `item name` VARCHAR(100) NULL,\r\n"
 	    		+ "  `price` DOUBLE NULL,\r\n"
 	    		+ "  `qty` INT NULL,\r\n"
 	    		+ "  `total` DOUBLE NULL);";


 statement=con.prepareStatement(sq);
 result=statement.executeUpdate();
 //con.close();
 if(result > 0)
 {
 	System.out.println("Table has been created sucessfully.");
 }
 }
 catch(Exception e)
 {
 	out.println(e);
 }
 for(String s1:arr){
	 String s2[]=s1.split(",",arr.length);
/*double temp = Double.parseDouble(s2[1]);
int temp1 = Integer.parseInt(s2[2]);
double temp2 = Double.parseDouble(s2[3]);*/

String sql = "insert into "+mob+" values(?,?,?,?);";


statement=con.prepareStatement(sql); 
if(s2.length>=4){
statement.setString(1, s2[0]); 
statement.setString(2, s2[1]); 
statement.setString(3, s2[2]); 
statement.setString(4, s2[3]); 
temp +=  Double.parseDouble(s2[3]);%>
<table>
  <tr>
    <td><%=s2[0] %></td>
    <td><%=s2[1] %></td>
    <td><%=s2[2] %></td>
    <td><%=s2[3] %></td>
  </tr>
</table>
<% 
result=statement.executeUpdate();}
//con.close();
if(result > 0)
{
	System.out.println("Data has been inserted sucessfully.");
}
/* out.println(s2.length);
	 for(int i=0;i<s2.length;i++)
		 out.println(s2[i]);  */
       
}
// out.println(temp);
 
 
%>
<table>
<tr>
<th>Total</th>
</tr>
<tr>
    <td><%=temp %></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
</table>
<input type="button" value="go back" onclick="goback()">
</body>
<script type="text/javascript">
function goback(){
	window.location.replace("billing.jsp");
}
</script>
</html>