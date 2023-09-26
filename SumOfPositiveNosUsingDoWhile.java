/**********************************************************************
 * File         :SumOfPositiveNosUsingDoWhile.java
 * Description  :Find sum of postive numbers using do while 
 * Author       :Shraya S Santhosh
 * Version      :1.0
 * Date         :26/9/2023
 *******************************************************************/
package newproj;
import java.util.Scanner;
public class SumOfPositiveNosUsingDoWhile {
	public static void main(String[]args)
	{
		int number=0,sum=0;
		Scanner sc=new Scanner(System.in);
		do{
			sum=sum+number;
			System.out.println("Enter a number");
			number=sc.nextInt();
			
		}while(number>0);
		System.out.println("Sum of positive numbers:"+sum);
	}

}
