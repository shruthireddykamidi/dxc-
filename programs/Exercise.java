package jp;
import java.io.*;
public class Exercise {

public static void main(String[] args)
{
   detectKey();
}
static void detectKey()
{
char key=' ';
System.out.print("Press a number key:");
try
{
key = (char)System.in.read();
}
catch(IOException e){};
switch (key)
{
case '0': System.out.println("You pressed 0."); break;
case '1': System.out.println("You pressed 1."); break;
case '2': System.out.println("You pressed 2."); break;
case '3': System.out.println("You pressed 3."); break;
case '4': System.out.println("You pressed 4."); break;
case '5': System.out.println("You pressed 5."); break;
case '6': System.out.println("You pressed 6."); break;
case '7': System.out.println("You pressed 7."); break;
case '8': System.out.println("You pressed 8."); break;
case '9': System.out.println("You pressed 9."); break;
default: System.out.println("Not allowed!"); 
break;
}
}
}


