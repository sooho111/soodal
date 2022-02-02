package soodal;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) { // for문 1번 구구단
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i=1; i < 10; i++) {
			System.out.println(a + " * " + i + " = " + a*i);
		}

	}

}
