package jp;
import java.util.Scanner;

public class Password {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
        int n = Usermaincode.display(s1);
        if(n==1){
         System.out.println("Valid password");
        }else{
         System.out.println("Invalid password");
        }

  }
}
class Usermaincode {
   
    
    public static int display(String password){
if(password.matches(".*[0-9]{1,}.*") && password.matches(".*[@#$]{1,}.*") && password.length()>=6 && password.length()<=20 && password.matches(".*[A-Z]{1,}.*"))
                    {
                                    return 1;
                    }
                    else
                    {
                                    return -1;
                    }
       }

    }