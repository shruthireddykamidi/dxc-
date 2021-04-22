<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>

<%
            //String dob = "1986-06-24"; 
String dob=request.getParameter("birthday");
            int yearDOB = Integer.parseInt(dob.substring(0, 4));
            int monthDOB = Integer.parseInt(dob.substring(5, 7));
            int dayDOB = Integer.parseInt(dob.substring(8, 10));

            DateFormat dateFormat = new SimpleDateFormat("yyyy");
            java.util.Date date = new java.util.Date();
            int thisYear = Integer.parseInt(dateFormat.format(date));

            dateFormat = new SimpleDateFormat("MM");
            date = new java.util.Date();
            int thisMonth = Integer.parseInt(dateFormat.format(date));

            dateFormat = new SimpleDateFormat("dd");
            date = new java.util.Date();
            int thisDay = Integer.parseInt(dateFormat.format(date));

            int age = thisYear - yearDOB;


            if (thisMonth < monthDOB) {
                age = age - 1;
        }

          if (thisMonth == monthDOB && thisDay < dayDOB) {
                age = age - 1;
        }
           
%>

<%=age%>