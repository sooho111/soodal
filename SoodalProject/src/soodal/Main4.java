package soodal;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) { // for문 3번 합
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = 0;
		
		for(int i=1; i <= a; i++) {
			b += i;
		}
		System.out.println(b);

	}

}
