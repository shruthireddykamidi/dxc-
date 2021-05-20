package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jakarta.servlet.*;
/**
 * Servlet implementation class Testing
 */
@WebServlet("/Testing")
public class Testing extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Testing() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter p = response.getWriter();
		Bill b;
		Bill b1;
		Bill b2 = null;
		int one =1;int flag=0;
		//String s = "rice,50,1,50, rice,50,1,50, rice,50,1,50, rice,50,1,50, rice,50,1,50, rice,50,1,50,";
		String s = (String) request.getAttribute("bill");
		String s1[] = new String[s.length()]; 
		String s2[] = new String[s.length()];
		ArrayList<Integer> arr = new ArrayList<Integer>();
		List<Bill> list1 = new ArrayList<Bill>();
		List<String> list2 = new ArrayList<String>();
		Set<String> set = new LinkedHashSet<String>();
		Set<Bill> set1 = new LinkedHashSet<Bill>();
		
		s1 = s.split(" ");
		//System.out.println(Arrays.toString(s1));
		for(int i=0;i<s1.length;i++)
		{
		    s2=s1[i].split(",");
		    System.out.println(Arrays.toString(s2));
		    double temp = Double.parseDouble(s2[1]);
		    int temp1 = Integer.parseInt(s2[2]);
		    double temp2 = Double.parseDouble(s2[3]);
		    Bill bt = new Bill(s2[0],temp,temp1,temp2);
		    list1.add(bt);
		}
		for(Bill i:list1)
		{
			set.add(i.getProductname());
			list2.add(i.getProductname());
		}
		
		for(String i:set)
		{ 
			int count = Collections.frequency(list2, i);
			arr.add(count);
			//System.out.println(count);
		}
		int j =0 ;
		set1.addAll(list1);
		//System.out.println(arr);
		 for(Bill i: set1) { 
			 i.setQty(((arr.get(j))));
			 i.setTotal(arr.get(j));
			 j++;
		 p.println(i.getProductname()+" "+i.getQty()+" "+i.getTotal()); 
			 }
		 p.println("<h1>working..</h1>");
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
