//프로그래머스_연습문제
//삼총사
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/131705?language=java

class Solution {
    public int solution(int[] number) {
        int answer = 0;

        for(int i=0; i<number.length-2; i++){
            for(int j=i+1; j<number.length-1; j++){
                for(int k=j+1; k<number.length; k++){
                    if(number[i]+number[j]+number[k]==0) answer++;
                }
            }
        }

        return answer;
    }
}
