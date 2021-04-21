package controller;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;



public class Product extends HttpServlet {
	

	
	public void service(HttpServletRequest request, HttpServletResponse response) throws  IOException {
		// TODO Auto-generated method stub
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2= Integer.parseInt(request.getParameter("num2"));
	int pro= num1 * num2;
	PrintWriter output = response.getWriter();
	output.println("\n the product:" +pro);
	}
}