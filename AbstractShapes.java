/*********************************************************************************************
 * File         :AbstractShapes.java
 * Description  :To get the number of sides of differet shapes
 * Author       :Shraya S Santhosh
 * Version      :1.0
 * Date         :27/10/2023
 *********************************************************************************************/
package newproj;

public class AbstractShapes {
	public static void main(String[]args) {
		Rectangle rectangle=new Rectangle();
		Triangle triangle=new Triangle();
		Hexagon hexagon=new Hexagon();
		rectangle.numberOfSides();
		triangle.numberOfSides();
		hexagon.numberOfSides();

	}
}
abstract class Shapes{
	abstract  public void numberOfSides();
}
class Rectangle extends Shapes{
	 public void numberOfSides() {
		System.out.println("No. of sildes of rectange is 4");
	}
}
class Triangle extends Shapes{
	 public void numberOfSides() {
		System.out.println("No. of sildes of triangle is 3");
	}
}
class Hexagon extends Shapes{
	 public void numberOfSides() {
		System.out.println("No. of sildes of hexagon is 6");
	}
}