package soodal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) { // for문 2번 A+B - 3
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i=1; i < 10; i++) {
			System.out.println(a + " * " + i + " = " + a*i);
		}

	}

}
