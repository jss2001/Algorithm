// 프로그래머스_코딩기초트레이닝
// flag에 따라 다른 값 반환하기
// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181933

class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if(flag==true){
            answer = a+b;
        }else{
            answer = a-b;
        }
        return answer;
    }
}
