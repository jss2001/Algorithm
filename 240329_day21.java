//프로그래머스_연습문제
//x만큼 간격이 있는 n개의 숫자
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12954

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        for (int i = 0; i < n; i++) {
            answer[i] = x * (i + 1);
        }
        
        return answer;
    }
}
