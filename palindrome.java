/**********************************************************************
 * File         :palindrome.java
 * Description  :To check whether a string is palindrome or not
 * Author       :Shraya S Santhosh
 * Version      :1.0
 * Date         :3/10/2023
 *******************************************************************/
package newproj;
import java.util.Scanner;
public class palindrome {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		boolean ispalindrome=check(str);
		if (ispalindrome==false)
		{
			System.out.println("Not Palindrome");
		}
		else
		{
			System.out.println("Palindrome");
		}
	}
	static boolean check(String str) {
	
		char []chararr=str.toCharArray();
		int len=str.length();
		for(int i=0;i<len/2;i++) {
			if(chararr[i]!=chararr[len-i-1])
			{
				return false;
			}
			
		return true;
		}
		return false;
		
	}

}
