package jp;
import java.io.*;
public class Variable
{
  public static void main(String[] args)throws Exception
  {
  
  File file = new File("C:\\java.txt");
  
  try(BufferedReader br = new BufferedReader(new FileReader(file)))
		  {
  
  String st;
  while ((st = br.readLine()) != null)
    System.out.println(st);
  }
}
}
