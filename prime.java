/**********************************************************************
 * File         :prime.java
 * Description  :To check whether a given number is prime or not
 * Author       :Shraya S Santhosh
 * Version      :1.0
 * Date         :31/10/2023
 *******************************************************************/
package newproj;
import java.util.Scanner;
public class prime {
      public static void main(String[]args) {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter number ");
    	  int number=sc.nextInt();
    	  int flag=0;
    	  for(int i=2;i<number;i++) {
    		  if(number%i==0) {
    			  flag++;
    		  }
    	  }
    	  if (flag==0) {
    		  System.out.println(number+" is prime");
    	  }
    	  else {
    		  System.out.println(number+" is not prime");
    	  }
      }
}
