//프로그래머스_코딩테스트입문
//머쓱이보다 키 큰 사람
//https://school.programmers.co.kr/learn/courses/30/lessons/120585?language=java

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        
       for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                answer++;
            }
        }
        
        return answer;
    }
}
