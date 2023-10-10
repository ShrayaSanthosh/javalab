/**********************************************************************
 * File         :frequencyStrings.java
 * Description  :To find the frequency of a character
 * Author       :Shraya S Santhosh
 * Version      :1.0
 * Date         :3/10/2023
 *******************************************************************/
package newproj;
import java.util.Scanner;
public class frequencyStrings {
  public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String string=sc.nextLine();
		System.out.println("Enter the character to check");
		char character=sc.next().charAt(0);
		int frequency=check(string,character);
		if (frequency==0)
		{
			System.out.println("The character is not present in the string");
		}
		else
		{
			System.out.println("Frequency of the character is "+frequency);
		}
		
	}
	static int check(String string,char character){
	
		char []charArray=string.toCharArray();
		int len=string.length(),count=0;
		for(int i=0;i<len;i++) 
		{
			if(charArray[i]==character)
			{
				count++;
			}
		}
		return count;
		
	}

}