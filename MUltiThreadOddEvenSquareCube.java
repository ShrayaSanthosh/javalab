package newproj;
import java.util.Random;
class NumManager{
	private int generatedNumber;
	private boolean numberGenerated=false;
	public synchronized void generateNumber() {
		generatedNumber=new Random().nextInt(99)+2;
		System.out.println("Generated number :"+generatedNumber);
		numberGenerated=true;
		notifyAll();
	}
	public synchronized void printEvenNumber() throws InterruptedException {
		while(!numberGenerated || generatedNumber%2!=0) {
			wait(); 
		}
		
		System.out.print("Square Of Generated Number : "+generatedNumber*generatedNumber);
		System.out.println();
		System.out.println();
		numberGenerated=false;
	}
	public synchronized void printOddNumber() throws InterruptedException {
		while(!numberGenerated || generatedNumber%2==0) {
			wait(); 
		}
		System.out.print("Cube of Generated Number : "+generatedNumber*generatedNumber*generatedNumber);
		System.out.println();
		System.out.println();
		numberGenerated=false;
	}
}
class NumGenerator extends Thread{
	NumManager numberManager;
	public NumGenerator(NumManager numberManager) {
		this.numberManager=numberManager;
	}
	public void run() {
		
		while(true) {
			numberManager.generateNumber();
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
class EvenSquareThread extends Thread{
	NumManager numberManager;
	public EvenSquareThread(NumManager numberManager) {
		this.numberManager=numberManager;
	}
	public void run() {
		while(true) {
			
			try {
				numberManager.printEvenNumber();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class OddCubeThread extends Thread{
	NumManager numberManager;
	public OddCubeThread(NumManager numberManager) {
		this.numberManager=numberManager;
	}
	public void run() {
		while(true) {
			
			try {
				numberManager.printOddNumber();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MUltiThreadOddEvenSquareCube {
	public static void main(String[] args) {
		NumManager numberManager=new NumManager();
		NumGenerator numbergenerator= new NumGenerator(numberManager);
		EvenSquareThread evenPrinterThread=new EvenSquareThread(numberManager);
		OddCubeThread oddPrinterThread=new OddCubeThread(numberManager);
		numbergenerator.start();
		evenPrinterThread.start();
		oddPrinterThread.start();
	}
}