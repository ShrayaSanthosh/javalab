package newproj;
import java.util.Scanner;
public class QuickSort {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the limit: ");
	        int limit = sc.nextInt();
	        sc.nextLine(); 
	        String[] string = new String[limit];
	        System.out.println("Enter the strings:");
	        for (int i = 0; i < limit; i++) {
	            string[i] = sc.nextLine();
	        }
	        quickSort(string, 0, limit - 1);

	        System.out.println("Sorted strings:");
	        for (int i = 0; i < limit; i++) {
	            System.out.println(string[i]);
	        }
	    }
	 public static void quickSort(String[] array, int lb, int ub) {
	        if (lb < ub) {
	            int loc = partition(array, lb, ub);
	            quickSort(array, lb, loc-1);
	            quickSort(array, loc+1, ub);
	        }
	    }
	 public static int partition(String[] array, int lb, int ub) {
	        String pivot = array[lb]; 
	        int i = lb;
	        for (int j = lb + 1; j <= ub; j++) {
	            if (array[j].compareTo(pivot) < 0) {
	                i++;
	                swap(array, i, j);
	            }
	        }
	        swap(array, lb, i);
	        return i;
	    }
    public static void swap(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
