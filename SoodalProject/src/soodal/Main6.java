package soodal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main6 {

	public static void main(String[] args) throws IOException { // for문 4번 빠른 A+B
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(bf.readLine()); //Int
		
		int arr[] = new int[t];
		
		for(int i=0; i<t; i++) {
			String a = bf.readLine();
			String sArr[] = a.split(" ");
			arr[i] = Integer.parseInt(sArr[0]) + Integer.parseInt(sArr[1]);
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
		
		for(int k : arr) {
			bw.write(k+"\n");   //버퍼에 있는 값 전부 출력			
		}
		bw.flush();   //남아있는 데이터를 모두 출력시킴
		bw.close();   //스트림을 닫음

	}

}
