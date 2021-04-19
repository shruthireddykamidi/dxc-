package jp;
import java.util.Scanner;
public class voting {
	public static void main(String args[])
	{
		int age;
	try(	Scanner sc = new Scanner(System.in))
	{
	    

		System.out.print("what is ur age?");
		age=sc.nextInt();
		if(age>=18)
			System.out.println("you are eligible to vote");
		else
			System.out.println("you are  not eligible to vote");

			
	}

}
}
