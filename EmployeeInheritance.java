/*********************************************************************************************
 * File         :EmployeeInheritance.java
 * Description  :To get details of employees(Officer, Manager)
 * Author       :Shraya S Santhosh
 * Version      :1.0
 * Date         :17/10/2023
 *********************************************************************************************/
package newproj;
import java.util.Scanner;
public class EmployeeInheritance {
	public static void main(String[]args) {
		Officer officer=new Officer();
		System.out.println("Enter details of officer");
		officer.setDetails();
		officer.setspecialization();
		System.out.println("Officer Details");
		officer.getDetails();
		officer.printSalary();
		officer.getspecialization();
		System.out.println("Enter details of manager");
		Manager manager=new Manager();
		manager.setDetails();
		manager.setdepartment();
		System.out.println("Manager Details");
		manager.getDetails();
		manager.printSalary();
		manager.getdepartment();
		
	}

}
class Employee{
	String name;
	int age,salary;;
	long phoneno;
	String address;
	Scanner sc=new Scanner(System.in);
	void setDetails() {
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("Enter phone number");
		phoneno=sc.nextLong();
		System.out.println("Enter address");
		sc.nextLine();
		address=sc.nextLine();
		System.out.println("Enter salary");
		salary=sc.nextInt();
	}
	void printSalary() {
		System.out.println("Salary :"+salary);
	}
	void getDetails() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Phone number : "+phoneno);
		System.out.println("Address : "+address);
	}
}
class Officer extends Employee {
	String specialization;
	void setspecialization() {
		System.out.println("Enter specialization");
		specialization=sc.next();
	}
	void getspecialization() {
		System.out.println("Specialization : "+specialization);
	}	
}
class Manager extends Employee {
	String department;
	void setdepartment() {
		System.out.println("Enter department");
		department=sc.next();
	}
	void getdepartment() {
		System.out.println("Department : "+department);
	}	
}