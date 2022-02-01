package soodal;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) { // if문 마지막 문제 : 45분 일찍 일어나기
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		m -= 45;
		if(m > 59) {
			h += 1;
			m = 0;
		} else if(m < 0) {
			h -= 1;
			m += 60;
		}
		if(h > 23) {
			h = 0;
		} else if(h < 0) {
			h = 23;
		}
		System.out.println(h + " "+ m);
	}

}
