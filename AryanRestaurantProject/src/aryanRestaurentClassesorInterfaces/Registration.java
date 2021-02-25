package aryanRestaurentClassesorInterfaces;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Registration {
	static String name;
	static String password;

	Scanner sc = new Scanner(System.in);
	CustomerDetails details = new CustomerDetails();

	public void name() {
		System.out.println("WelCome to Aryan Restaurent sir/madem: ");
		System.out.println();
		try {
			System.out.println("Please Enter your Name: ");
			name = sc.next();
			if (Pattern.matches("[A-Za-z]*", name)) {
				details.setName(name);
			} else {
				// Throw new
				System.out.println("DBSADSA");
			}
		} catch (Exception e) {
			System.out.println("Re-enter Please");
			name();
		}

	}

	public void phoneNumber() {
		try {
			System.out.println("Enter your phoneNumber: ");
			String phone = sc.next();
			if (Pattern.matches("[0-9]{1,10}", phone)) {
				details.setPhoneNumber(phone);
			} else {
				// Throw new
			}
		} catch (Exception e) {
			System.out.println("Re-Enter the Number: ");
			phoneNumber();
		}

	}

	public void password() {
		try {
			System.out.println("Enter your Password: ");

			password = sc.next();

			if (Pattern.matches("[A-Za-z]{1,5}[0-9]{1,5}", password)) {
				details.setPassword(password);
			} else {
				// Throw
			}
		} catch (Exception e) {
			System.out.println("Re-Enter the password");
			password();
		}

	}

	public void conformPassword() {
		try {
			System.out.println("Enter ConformPassword: ");
			String cmPwd = sc.next();
			if (Registration.password.equalsIgnoreCase(cmPwd)) {
				details.setConformPassword(cmPwd);
				System.out.println("Registration Sucessfull Login-In: ");
			} else {
				// Throw new
			}
		} catch (Exception e) {
			System.out.println("Re-Enter ConFormPAssword: ");
			conformPassword();
		}
	}

	public void userLogin() {
		try {
			System.out.println("Enter your Name: ");
			String uName = sc.next();
			System.out.println("Enter your Password: ");
			String uPwd = sc.next();

			if (uName.equalsIgnoreCase(name) && uPwd.equalsIgnoreCase(password)) {
				System.out.println(name + " WelCome to Aryan Resturent ");

			} else {
				// Throw new
			}
		} catch (Exception e) {
			System.out.println("Re-Enter");
			userLogin();
		}
	}

	public void demo() {

		Items items = new Items();
		items.menuu();

	}

	public void run() {

		name();
		phoneNumber();
		password();
		conformPassword();
		userLogin();
		demo();

	}

}
