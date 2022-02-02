package soodal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) { // for문 5번 거꾸로 N찍기
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i=a; i >= 1; i--) {
			System.out.println(i);
		}

	}

}
