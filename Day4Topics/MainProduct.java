package Day4Topics;

import java.util.Scanner;

public class MainProduct {

	public static void main(String[] args) 
	{
		System.out.println("Enter '1' to Set & Get productId");
		System.out.println("Enter '2' to Set & Get productName");
		System.out.println("Enter '3' to Set & Get productPrice");
		Scanner key =new Scanner(System.in);
		int i =key.nextInt();
		switch (i) {
		case 1: ProductMethods.m1(); 
			break;
		case 2: ProductMethods.m2();
			break;
		case 3: ProductMethods.m3();
			break;

		default:
			break;
		}
	}

}
