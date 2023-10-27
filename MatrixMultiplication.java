/*********************************************************************************************
 * File         :MatrixMultiplication.java
 * Description  :To multiply two matrix using arrays
 * Author       :Shraya S Santhosh
 * Version      :1.0
 * Date         :3/10/2023
 *********************************************************************************************/
package newproj;
import java.util.Scanner;
public class MatrixMultiplication {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the order of the first matrix:");
		int ROW_SIZE_1=sc.nextInt();
		int COLUMN_SIZE_1=sc.nextInt();
		int [][]matrix1=new int[ROW_SIZE_1][COLUMN_SIZE_1];
		System.out.println("Enter the values of the first matrix:");
		for (int i=0;i<ROW_SIZE_1;i++) {
			for (int j=0;j<COLUMN_SIZE_1;j++) {
				matrix1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the order of the second matrix:");
		int ROW_SIZE_2=sc.nextInt();
		int COLUMN_SIZE_2=sc.nextInt();
		int [][]matrix2=new int[ROW_SIZE_2][COLUMN_SIZE_2];
		System.out.println("Enter the values of the second matrix:");
		for (int i=0;i<ROW_SIZE_2;i++) {
			for (int j=0;j<COLUMN_SIZE_2;j++) {
				matrix2[i][j]=sc.nextInt();
			}
		}
		System.out.println("First matrix:");
		for (int i=0;i<ROW_SIZE_1;i++) {
			for (int j=0;j<COLUMN_SIZE_1;j++) {
				System.out.print(matrix1[i][j]+"\t");
		    }
			System.out.println();
		}
		System.out.println("Second matrix:");
		for (int i=0;i<ROW_SIZE_2;i++) {
			for (int j=0;j<COLUMN_SIZE_2;j++) {
				System.out.print(matrix2[i][j]+"\t");
			}
			System.out.println();
		}
		
		if (COLUMN_SIZE_1!=ROW_SIZE_2)
		{
			System.out.println("Multiplication not possible");
		}
		else
		{
			int [][]matrix3=new int[ROW_SIZE_1][COLUMN_SIZE_2];
			System.out.println("Resultant Matrix is:");
			for (int i=0;i<ROW_SIZE_1;i++) {
				for (int j=0;j<COLUMN_SIZE_2;j++) {
					matrix3[i][j]=0;
					for (int k=0;k<COLUMN_SIZE_1;k++) {
						matrix3[i][j]=matrix3[i][j]+matrix1[k][j]*matrix2[i][k];
					}
					System.out.print(matrix3[i][j]+"\t");
				}
				System.out.println();
			}
		}
		
	}

}
