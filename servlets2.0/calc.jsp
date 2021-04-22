<%

String str=request.getParameter("r1");
String final_output="";
int a,b,total=0;
a=Integer.parseInt(request.getParameter("a"));
b=Integer.parseInt(request.getParameter("b"));
if("add".equals(str))
{
total=a+b;
}
else if("sub".equals(str))
{
total=a-b;
}
else if("mul".equals(str))
{
total=a*b;
}
else if("div".equals(str))
{
total=a/b;
}
Integer result=new Integer(total);
out.println("calculation of numbers is"+result.toString());
%>