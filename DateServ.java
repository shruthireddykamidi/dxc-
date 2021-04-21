package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


	@WebServlet("/DateTime")
	public class DateServ extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       
	   
	    public DateServ() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			  //set response content type
	        response.setContentType("text/html");
	        
	        PrintWriter pw = response.getWriter();
	        java.util.Date date = new java.util.Date();
	        pw.println("<h2>"+"Current Date and Time: " +date.toString()+"</h2>");
	        //close stream object
	        pw.close();
			
		}

	}
	