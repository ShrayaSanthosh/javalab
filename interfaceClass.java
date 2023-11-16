package projects;
abstract class Animal{
	protected int legs;
	protected Animal(int legs) {
		this.legs=legs;
	}
	public abstract void eat();
	public void walk() {
		System.out.println("This animal walks on "+legs+" legs ");
	}
}


class Spider extends Animal{
	public Spider(){
		super(8); //All spiders have eight legs
	}
	//@Overridding
	public void eat() {
		System.out.println("Spider eat insects");
	}
}


interface Pet{
	String getName() ;
	void setName(String name);
	void play();
}


class Cat extends Animal implements Pet{
	private String name;
	public Cat(String name) {
		super(4);  //all cats have 4 legs
		this.name=name;
	}
	Cat(){
		this("");
	}
	// @overriding
	public void eat() {
		System.out.println("Cat eat fishes");
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void play() {
		System.out.println("Cat is playing");
	}
}


class Fish extends Animal implements Pet{
    String name;
	public Fish() {
		super(0); //Fish don't have legs
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	
	public void play() {
		System.out.println("Fish is playing");
	}
	public void eat() {
		System.out.println("Fish eat plants");
	}
	public void walk() {
		System.out.println("Fish has no legs");
	}
}


public class interfaceClass {
	public static void main(String[]args) {
		Fish fish=new Fish();
		fish.setName("Mimi");
        String name=fish.getName();
        System.out.println("FISH");
        System.out.println("This fish's name is "+name);
        fish.eat();
        fish.walk();
        fish.setName("Momo");
        String name1=fish.getName();
        System.out.println("This fish's name is "+name1);
        
        System.out.println();
        Cat cat=new Cat();
		cat.setName("Fluffy");
        String name2=cat.getName();
        System.out.println("CAT");
        System.out.println("This Cat's name is "+name2);
        cat.walk();
		cat.eat();
		cat.setName("isMoose");
        String name3=cat.getName();
        System.out.println("This Cat's name is "+name3);
        
        System.out.println();
        Spider spider=new Spider();
        System.out.println("SPIDER");
        spider.eat();
        spider.walk();
      
        
	}
}
