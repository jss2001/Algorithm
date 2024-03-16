//프로그래머스_코딩기초트레이닝
//문자열 돌리기
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181945

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for(int i=0; i<a.length(); i++){
            System.out.println(a.charAt(i));
            //charAt-string 타입으로 받은 문자열을 char 타입으로 한 글자만 받는 함수
        }
    }
}
