package jp;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class Append{
	public static void main(String args[]) throws IOException {
FileWriter fw = null; 
BufferedWriter bw = null;
PrintWriter pw = null;
try { 
	fw = new FileWriter("C:\\test.txt", true);
bw = new BufferedWriter(fw);
pw = new PrintWriter(bw);
pw.println("Shane"); 
pw.println("Root");
pw.println("Ben"); 
System.out.println("Data Successfully appended into file"); 
pw.flush(); 
} 
finally { 
	try {
		pw.close();
		bw.close();
		fw.close();
		} 
catch (IOException io) {
	// can't do anything
	} 
} 
}
}