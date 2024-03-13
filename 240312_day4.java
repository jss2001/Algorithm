//프로그래머스_코딩기초트레이닝
//배열에서 문자열 대소문자 변환하기
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181875
class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                answer[i] = strArr[i].toLowerCase();
            } else {
                answer[i] = strArr[i].toUpperCase();
            }
        }
        return answer;
    }
}
