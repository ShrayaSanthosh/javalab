/*
 * File         : Sum.java
 * Description  :Find sum of 2 numbers
 * Author       :Shraya S Santhosh
 * Version      :1.0
 * Date         :26/9/2023
 */
package newproj;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args)
	{
		int number1,number2,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		number1=sc.nextInt();
		System.out.println("Enter the second number");
		number2=sc.nextInt();
		sum=number1+number2;
		System.out.println("Sum of the entered two numbers:"+sum);
	}

}
