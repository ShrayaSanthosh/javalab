/*
 * File         :Grade.java
 * Description  :Find grade
 * Author       :Shraya S Santhosh
 * Version      :1.0
 * Date         :26/9/2023
 */
package newproj;
import java.util.Scanner;
public class Grade {
  public static void main(String[]args)
  {
	  int mark;
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter Mark:");
	  mark=sc.nextInt();
	  if (mark>=90&&mark<=100)
	  {
		  System.out.println("Grade:A+");
	  }
	  else if(mark>=80&&mark<90)
	  {
		  System.out.println("Grade:A");
	  }
	  else if (mark>=70&&mark<80)
	  {
		  System.out.println("Grade:B+");
	  }
	  else if (mark>=60&&mark<70)
	  {
		  System.out.println("Grade:B");
	  }
	  else if (mark>=50&&mark<60)
	  {
		  System.out.println("Grade:C+");
	  }
	  else if (mark>=40&&mark<50)
	  {
		  System.out.println("Grade:C");
	  }
	  else if (mark<40)
	  {
		  System.out.println("Fail");
	  }
  }
}
