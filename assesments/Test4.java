package jp;
import java.awt.Menu;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Test4 {
//@SuppressWarnings("deprecation")
public static void main(String [] args)
{
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the input string");
    String s1=s.nextLine();

    Map<Character,Integer> map=new TreeMap<Character,Integer>();

    for(int i = 0; i < s1.length(); i++){
       char c = s1.charAt(i);
       Integer val = map.get(new Character(c));
       if(val != null){
         Integer put = map.put(c, new Integer(val + 1));
       }else{
         map.put(c,1);
       }
    }           

    for(Map.Entry<Character,Integer> en:map.entrySet()){
        int count=en.getValue();
        System.out.printf("%c : ",en.getKey());
        for(int i=0;i<count;i++)
        System.out.printf("*");

        System.out.printf("\n");
    }


    }
}
