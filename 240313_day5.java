//프로그래머스_코딩 기초 트레이닝
//qr code 
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181903

class Solution {

        public static String solution(int q, int r, String code) {
            String answer = "";

            for (int i = r; i < code.length() ; i+=q) {
                answer += String.valueOf(code.charAt(i));
            }
                return answer;
        }
}
