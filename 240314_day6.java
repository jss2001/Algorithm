//프로그래머스_코딩기초트레이닝
//문자열 겹쳐쓰기
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181943

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
       String answer = my_string.substring(0, s) + overwrite_string;

        if(my_string.length() > answer.length()) {
            answer += my_string.substring(answer.length());
        }
        return answer;
    }
}
