package jp;
import java.io.*;

public class Correctchoice
{
public static void main(String[] args)
{
selectChoice();
}

static void selectChoice(){

String choice;
String con;
try{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("What is the command keyword to exit a loop in Java?");
System.out.println("a.quit");
System.out.println("b.continue");
System.out.println("c.break");
System.out.println("d.exit");


do
{

System.out.print("Enter your choice:");
choice =br.readLine();

if (choice.compareTo("c")==0)
{
System.out.println("Congratulation!");
}
else if (choice.compareTo("q")==0 || choice.compareTo("e")==0) {  System.out.println("Exiting...!"); break; }
else System.out.println("Incorrect!");

System.out.print("Again? press y to continue:");
con =br.readLine();
} while (con.compareTo("y")==0);

}catch(IOException e){}


  }

}
