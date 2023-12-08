package newproj;
import java.util.LinkedList;
import java.util.Scanner;
public class DoublyLL {
	public static void main(String[] args) {
		DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println();
            System.out.println("1. Insert at Front");
            System.out.println("2. Insert at Last");
            System.out.println("3. Insert at any Position");
            System.out.println("4. Remove at any Position");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.println();
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch (choice) {
            case 1: 
            	System.out.println("Enter the Element to insert");
            	int elements=sc.nextInt();
            	doublyLinkedList.insertFront(elements);
            	break;
            case 2:
            	System.out.println("Enter the Element to insert");
            	elements=sc.nextInt();
            	doublyLinkedList.insertEnd(elements);
            	break;
            case 3:
            	System.out.println("Enter the Element to insert");
            	elements=sc.nextInt();
            	System.out.println("Enter the Position");
            	int position = sc.nextInt();
            	doublyLinkedList.insertAnyPosition(position,elements );
            	break;
            case 4:
            	System.out.println("Enter the Position");
            	position = sc.nextInt();
            	doublyLinkedList.removeAnyPosition(position);
            	break;
            case 5:
            	System.out.println("Elememts in Doubly Linked List :");
            	doublyLinkedList.display();
            	break;
            default:
            	System.out.println("Exited  ");
            	break;
            }
		} while(choice<6);
            	
	}

}
class DoublyLinkedList<T>{
	private LinkedList<T> list = new LinkedList<>();
	public void insertFront (T element){
		list.addFirst(element);
	}
	public void insertEnd(T element) {
		list.addLast(element);
	}
	public void insertAnyPosition(int pos, T element){
		list.add(pos, element);
	}
	public void  removeAnyPosition(int pos){
	 System.out.println("Removed Element : "+list.remove(pos));	
	}
	public void display() {
	 for(T element: list) {
		 System.out.println(element);
	 }
	 System.out.println();
	}
}