//프로그래머스_코딩기초트레이닝
//길이에 따른 연산
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181879

class Solution {
    public static long solution(int[] numList) {
        // 리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을 반환
        if (numList.length >= 11) {
            long sum = 0;
            for (int num : numList) {
                sum += num;
            }
            return sum;
        } else {
            // 리스트에 있는 모든 원소의 곱을 계산하여 반환
            long result = 1;
            for (int num : numList) {
                result *= num;
            }
            return result;
        }
    }
}
