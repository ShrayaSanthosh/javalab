/*********************************************************************************************
 * File         :AreaShapesOverloading.java
 * Description  :To calculate area of different shapes using the method of overloading
 * Author       :Shraya S Santhosh
 * Version      :1.0
 * Date         :3/10/2023
 *********************************************************************************************/
package newproj;
import java.util.Scanner;
public class AreaShapesOverloading {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	Shapes shape=new Shapes();
	System.out.println("Enter the Base of the Triangle");
	float base=sc.nextFloat();
	System.out.println("Enter the Height of the Triangle");
	float height=sc.nextFloat();
	System.out.println("Enter the length of the Rectangle");
	int length=sc.nextInt();
	System.out.println("Enter the breadth of the Rectangle");
	int breadth =sc.nextInt();
	System.out.println("Enter the Radius of the Circle");
	float radius=sc.nextFloat();
	shape.area(base,height);
	shape.area(length,breadth);
	shape.area(radius);
	}

}
class Shapes{
	Scanner sc=new Scanner(System.in);
	public static void  area(float base,float height) {
		float area=(base*height)/2;
		System.out.println("Area of Triangle with base: "+base+" and height: "+height+" is: "+area);
	}
	public static void area(int length,int breadth) {
		int area=length*breadth;
		System.out.println("Area of Rectangle with width: "+length+" and height: "+breadth+" is: "+area);
	}
	static void area(Float radius) {
		double area=3.14*radius*radius;
		System.out.println("Area of Circle with radius: "+radius+" is: "+area);
	}
}