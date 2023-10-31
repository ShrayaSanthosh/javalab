/**********************************************************************
 * File         :SecondSmallest.java
 * Description  :To display second smallest element in an array
 * Author       :Shraya S Santhosh
 * Version      :1.0
 * Date         :31/10/2023
 *******************************************************************/
package newproj;
import java.util.Scanner;
public class SecondSmallest {
	public static void main(String[]agrs) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit=sc.nextInt();
		int []array=new int[limit];
		System.out.println("Enter the elements of the array ");
		for(int i=0;i<limit;i++) {
			array[i]=sc.nextInt();
		}
		for(int i=0;i<limit;i++) {
			for(int j=i+1;j<limit;j++) {
				if(array[i]>array[j]) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}

		System.out.println("Second smallest element is "+array[1]);
	}
}
