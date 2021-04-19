package jp;
import java.util.Scanner;
public class ArrayExample
{
	public static void main(String[] args) {
 try (Scanner s = new Scanner(System.in))
{
int totalcase, eachcasevalue;
totalcase = s.nextInt();
int[][] arr = new int[totalcase][];
for(int i=0;i<arr.length;i++) {
    eachcasevalue = s.nextInt();
    arr[i] = new int[eachcasevalue];
    for(int j = 0;j<arr[i].length;j++) {
        arr[i][j]=s.nextInt();
    }
}

 int even =0 ,odd=0;

    for (int i=0;i<arr.length;i++) {
        even = 0; odd = 0;
        System.out.println("testcase" +i+ "with" +arr[i].length +"values");
        for(int j=0;j<arr[i].length;j++) {
            System.out.println(arr[i][j]+"  ");
            if(arr[i][j]%2==0) {
                even++;
            }
            else {odd++;}
            }
            System.out.println("total even -" +even +" total odd -" +odd); 
        
        }System.out.println();
       
    }
        
	}
}


