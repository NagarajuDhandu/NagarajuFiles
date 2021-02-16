package day2Topics;

import java.util.ArrayList;
import java.util.Scanner;

public class SampleProgram 
{
	int SampleProgram() {
	int res, m;
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> mul = new ArrayList<Integer>();
	System.out.println("Enter Three Numbers : ");
	int result = 0;
	while (sc.hasNextInt()) {
	mul.add(sc.nextInt());
	}
	for (int i = 0; i < 3; i++) {
	if (mul.get(i) <= 0) {
	return -1;

	}
	if (mul.get(i) % 10 == 0) {
	result = result + mul.get(i);
	continue;
	} else {
	res = mul.get(i) % 10;
	if (res >= 1) {
	m = 10 - res;
	res = mul.get(i) + m;
	result = result + res;
	continue;
	}
	}
	}
	sc.close();
	return result;

	}

	public static void main(String[] args) {
	SampleProgram t = new SampleProgram();
	System.out.println(t.SampleProgram());

	}




	


}
