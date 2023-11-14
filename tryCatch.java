package programs;
import java.util.Scanner;
public class tryCatch {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		char choice='y';
		while(choice=='y') {
			try {
				System.out.println("Program to perform Division");
		        System.out.println("Enter no 1");
		        int number1=sc.nextInt();
		        System.out.println("Enter no 2");
		        int number2=sc.nextInt();
			    int result=number1/number2;
			    System.out.println("Result="+result);
		    }
			catch(ArithmeticException e) {
			     System.out.println("Division by Zero is not possible");
		    }
			finally {
				System.out.println("End of Operation");
			}
		    System.out.println("Do you want to continue y or n");
		    choice=sc.next().charAt(0);
		}
	}
}
