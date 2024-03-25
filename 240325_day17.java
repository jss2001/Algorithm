//프로그래머스_월간 코드 챌린지 시즌3
//없는 숫자 더하기
//문제:https://school.programmers.co.kr/learn/courses/30/lessons/86051

class Solution {
    public int solution(int[] numbers) {
        int sum = 45;
        int answer = 0;

        for (int i = 0; i < numbers.length; i++) {
            answer = answer + numbers[i];
        }
        return sum - answer;
    }
}
