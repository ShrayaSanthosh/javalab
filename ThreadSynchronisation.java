package newproj;
import java. util.Scanner;
public class ThreadSynchronisation {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		multiTable tab=new multiTable();
		System.out.println("Enter the number 1");
		int number1=sc.nextInt();
		System.out.println("Enter the number 2");
		int number2=sc.nextInt();
		System.out.println("Enter the number 3");
		int number3=sc.nextInt();
		thread1 t1= new thread1(tab,number1);
		thread2 t2= new thread2(tab,number2);
		thread3 t3=new thread3(tab,number3);
		t1.start();
		t2.start();
		t3.start();
		
	}
}
class multiTable{
	synchronized void printTable(int num) {              //synchronized used as a function
		/*synchronized (this) {*/	                     //synchronized is used as a block
		for(int i=1;i<=10;i++) {
				System.out.println(num+"*"+i+"="+num*i);
			}
	    /*}*/   //synchronized can be used in block as well as in function 
		System.out.println();
	}
}
class thread1 extends Thread{
	int number;
	multiTable m; 
	thread1(multiTable in,int num){
		this.m=in;
		this.number=num;
	}
	public void run() {
		
		m.printTable(number);
	}
}
class thread2 extends Thread{
	int number;
	multiTable m; 
	thread2(multiTable in,int num){
		this.m=in;
		this.number=num;
	}
	public void run() {
		
		m.printTable(number);
	}
}
class thread3 extends Thread{
	int number;
	multiTable m;
	thread3(multiTable in,int num){
		this.m=in;
		this.number=num;
	}
	public void run() {
		
		m.printTable(number);
	}
}