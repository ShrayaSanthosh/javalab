package newproj;
import java.util.StringTokenizer;
import java.util.Scanner;
public class StringTokenizerSum {
      public static void main(String[] args) {
    	  Scanner sc= new Scanner(System.in);
		  System.out.println("Enter the string :");
		  String line=sc.nextLine();
		  StringTokenizer string=new StringTokenizer(line);
		  int no,sum=0;
		  while(string.hasMoreTokens()) {
			  no=Integer.parseInt(string.nextToken());
			  sum=sum+no;
		  }
		  System.out.println("Sum :"+sum);
		 
	}
}
