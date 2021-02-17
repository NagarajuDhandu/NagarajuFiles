package day3Topics;

public class Cat extends  Animal 
{
	void eat()
	{
		System.out.println("Eating Fish...");
	}
	
	
	public static void main(String[] args) {
		Animal aa= new Animal();
		aa.eat();
		Animal animal = new Cat();
		animal.eat();
		
		Cat cat = new Cat();
		cat.eat();
		
	}
}
