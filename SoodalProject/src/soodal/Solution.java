package soodal;

public class Solution {
	
	public int[] solution(int[] lottos, int[] win_nums) { // 프로그래머스 로또 최고, 최저 순위 구하기
		int zero = 0;
        int matched = 0;
        
        for (int l : lottos) {
            if (l == 0) { zero++;
            System.out.println("zero === " + zero); }
            else {
                for (int w : win_nums) {
                    if (l == w) {
                        matched++;
                        System.out.println("matched === " + matched);
                        break;
                    }
                }
            }
        }
        
        int min = matched;
        int max = matched + zero;
        
        System.out.println("min === " + min);
        System.out.println("max === " + max);
        
        int[] answer = {Math.min(7 - max, 6), Math.min(7 - min, 6)};
        return answer;
	}
}
