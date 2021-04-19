package jp;

import java.util.Random;


public class Arrayrandom {
	

	public static void main(String[] args) {
		int i;
		
		// TODO Auto-generated method stub
		int [] arr=new int[100];
		Random obj = new  Random();
		for(i=0;i<arr.length;i++)
		{
			arr[i]=obj.nextInt(101);
		}
//		System.out.println(obj.nextInt(11));
		System.out.println("the array after filling 100 values:");
		for(i=0;i<arr.length;i++)
		{
			
			System.out.print(arr[i]+" ");

		}

			
		

		
		
		

	}



}
