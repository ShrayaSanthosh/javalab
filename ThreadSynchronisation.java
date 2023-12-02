package newproj;
import java. util.Scanner;
public class ThreadSynchronisation {
	public static void main(String[]args){
		multiTable tab=new multiTable();
		thread1 t1= new thread1(tab);
		thread2 t2= new thread2(tab);
		thread3 t3=new thread3(tab);
		t2.setPriority(1);
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
	    /*}*/                                            //synchronized can be used in block as well as in function 
	}
}
class thread1 extends Thread{
	multiTable m; 
	thread1(multiTable in){
		this.m=in;
	}
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
		m.printTable(5);
	}
}
class thread2 extends Thread{
	multiTable m; 
	thread2(multiTable in){
		this.m=in;
	}
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
		m.printTable(7);
	}
}
class thread3 extends Thread{
	multiTable m;
	thread3(multiTable in){
		this.m=in;
	}
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
		m.printTable(9);
	}
}