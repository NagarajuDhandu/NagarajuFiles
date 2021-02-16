package day2Topics;

public class MainInheritance {

	public static void main(String[] args) 
	{
		Animal  animal=new Dog();
		Dog dog=(Dog) animal;
		
		dog.eat();
		dog.brak();
		
		System.out.println();
		
		Animal animal2=new Cat();
		Cat cat=(Cat) animal2;
		cat.eat();
		cat.meow();
	}

}
