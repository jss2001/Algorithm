//프로그래머스 _월간 코드 챌린지 시즌2
//약수의 개수와 덧셈
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/77884

public class Solution {
public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            // 약수의 개수가 짝수인 경우 해당 수를 더하고, 홀수인 경우 뺌
            answer += (isDivisorCountEven(i)) ? i : -i;
        }

        return answer; 
    }

    // 주어진 수의 약수의 개수가 짝수인지 확인
    private boolean isDivisorCountEven(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count += (i * i == n) ? 1 : 2; // 약수가 중복되지 않도록 처리
            }
        }
        return count % 2 == 0;
    }
    
}
