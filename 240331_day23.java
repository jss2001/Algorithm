//프로그래머스_연습문제
//자릿수 더하기
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12931

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 숫자를 문자열로 변환하여 각 자리수의 합을 계산
        String num = String.valueOf(n);
        for (int i = 0; i < num.length(); i++) {
            answer += num.charAt(i) - '0';
        }
        
        return answer;
    }
}
