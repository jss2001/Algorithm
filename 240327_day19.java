//프로그래머스_월간 코드 챌린지 시즌2
//음양 더하기
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/76501

class Solution {
     public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                sum += absolutes[i];
            } else {
                sum -= absolutes[i];
            }
        }
        return sum;

   //     깔끔한 코드   
   //     for (int i=0; i<signs.length; i++)
   //         answer += absolutes[i] * (signs[i]? 1: -1);

    }
}
