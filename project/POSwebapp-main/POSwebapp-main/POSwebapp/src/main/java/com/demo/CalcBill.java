package com.demo;
import java.util.*;
public class CalcBill {
	static void call(){
		String s = "rice,50,1,50, rice,50,1,50, rice,50,1,50, rice,50,1,50, rice,50,1,50, rice,50,1,50,";
	    Set<Bill> set = new LinkedHashSet<Bill>();
		set = calc(s);
		for(Bill i : set)
		System.out.println(i.getProductname()+" "+i.getPrice()+" "+i.getQty()+" "+i.getTotal());
	}
	public static Set<Bill> calc(String items) {	
		Bill b;
		Bill b1;
		Bill b2 = null;
		int one =1;int flag=0;
		//String s = "rice,50,1,50, rice,50,1,50, rice,50,1,50, rice,50,1,50, rice,50,1,50, rice,50,1,50,";
		String s = items;
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
		System.out.println(arr);
		 for(Bill i: set1) { 
			 i.setQty(((arr.get(j))));
			 i.setTotal(arr.get(j));
			 j++;
		 System.out.println(i.getProductname()+" "+i.getQty()+" "+i.getTotal()); 
			 }
		 return set1;
		
		
	}
}
