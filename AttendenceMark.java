/*
 * File         :AttendenceMark.java
 * Description  :Find Marks for attendence
 * Author       :Shraya S Santhosh
 * Version      :1.0
 * Date         :26/9/2023
 */
package newproj;
import java.util.Scanner;
public class AttendenceMark 
  {
	public static void main(String[]args)
	 {
		int attendence;
		float mark;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the attendence percentage");
		attendence=sc.nextInt();
		if (attendence>=90)
		{
			System.out.println("Marks for attendence : 10");
		}
		else
		{
			mark=(float)attendence/10;
			System.out.println("Marks for attendence :"+mark);
		}
	 }

}
