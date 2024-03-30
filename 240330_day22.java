//프로그래머스_연습문제
//크기가 작은 부분 문자열
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/147355

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pInt = Long.parseLong(p); 
        for (int i = 0; i <= t.length() - p.length(); i++) {
            String subStr = t.substring(i, i + p.length());
            long subInt = Long.parseLong(subStr); 
            if (subInt <= pInt) {
                answer++;
            }
        }
        return answer;
    }

}

