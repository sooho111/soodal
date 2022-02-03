package soodal;

public class Solution {
	
	public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = {};
		int[] lotto = new int[45];
		
		for(int i=0; i < lotto.length; i++) {        	
			lotto[i] = (int)(Math.random()*45 +1);
		}
		for(int i=0; i < lotto.length; i++) {
			System.out.println("?" + lotto[i]);   
		}
		
		return answer;
	}

}
