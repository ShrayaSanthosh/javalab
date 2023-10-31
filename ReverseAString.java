/**********************************************************************
*File          :ReverseAString.java
* Description  :To display reverse of a string
* Author       :Shraya S Santhosh
* Version      :1.0
* Date         :31/10/2023
*******************************************************************/
package newproj;
import java.util.Scanner;
public class ReverseAString {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=sc.next();
		int len=str.length();
		char []chararr=str.toCharArray();
		char []reverse=new char[len];
		System.out.println("Reversed string is : ");
		for(int i=0;i<len;i++) {
			   reverse[i]=chararr[len-i-1];
			   System.out.print(reverse[i]);
			 }
		
	}


}
