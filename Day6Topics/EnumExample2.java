package Day6Topics;

import java.util.Scanner;

public class EnumExample2 
{
	enum Day{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY}

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);

		String D=scanner.next();
		Day d=Day.valueOf(D);

				switch(d)
				{
				case SUNDAY:
					System.out.println("sunday");
					break;
				case MONDAY:
					System.out.println("monday");
					break;
				case TUESDAY:
					System.out.println("tursday");
					break;
				case WEDNESDAY:
					System.out.println("wednesday");
					break;
				}
	}
}
