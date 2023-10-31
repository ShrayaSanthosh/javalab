/**********************************************************************
 * File         :TransposeMatrix.java
 * Description  :Display transpose of a matrix
 * Author       :Shraya S Santhosh
 * Version      :1.0
 * Date         :31/9/2023
 *******************************************************************/
package newproj;
import java.util.Scanner;
public class TransposeMatrix {
    public static void main(String[]agrs) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the order of the matrix : ");
    	int row=sc.nextInt();
    	int column=sc.nextInt();
    	int [][]matrix=new int[row][column];
    	int [][]transpose=new int[column][row];
    	System.out.println("Enter th elements of the matrix : ");
    	for (int i=0;i<row;i++) {
    		for(int j=0;j<column;j++) {
    			matrix[i][j]=sc.nextInt();
    		}
    	}
    	System.out.println("Matrix : ");
    	for (int i=0;i<row;i++) {
    		for(int j=0;j<column;j++) {
    			System.out.print(matrix[i][j]+"\t");
    		}
    	System.out.println();	
    	}
    	System.out.println("Transpose of given matrix :");
    	for (int i=0;i<row;i++) {
    		for(int j=0;j<column;j++) {
    			System.out.print(matrix[j][i]+"\t");
    			}
    	System.out.println();
    	
    }
}
}
