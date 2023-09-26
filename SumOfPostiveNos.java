/**********************************************************************
 * File         :SumOfPositiveNos.java
 * Description  :Find sum of postive numbers
 * Author       :Shraya S Santhosh
 * Version      :1.0
 * Date         :26/9/2023
 *******************************************************************/
package newproj;
import java.util.Scanner;
public class SumOfPostiveNos {
	public static void main(String[]args)
	{
		int number,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		number=sc.nextInt();
		while(number>0)
		{
			sum=sum+number;
			System.out.println("Enter a number");
			number=sc.nextInt();
			
		}
		System.out.println("Sum of positive numbers:"+sum);
	}

}

