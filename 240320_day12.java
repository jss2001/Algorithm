// 프로그래머스_코딩기초트레이닝
// 빈 배열에 추가, 삭제하기
// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181860

import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    list.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    list.remove(list.size() - 1);
                }
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
