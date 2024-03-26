// 백준_2024 상반기 전남대학교 PIMM 알고리즘 파티_시계탑
// 문제 : https://www.acmicpc.net/problem/31561

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int inputMinute = scanner.nextInt();
        
        double correctMinute = 0;

        //분침이 30분을 가리키는 경우
        if (inputMinute >= 30) {
            correctMinute += 15;
            inputMinute -= 30;
            correctMinute += inputMinute * 1.5;
        } else { //분침 30분 미만인 경우
            correctMinute = inputMinute / 2.0; //2로 할 경우 소수점이하 값이 버려져서 틀림
        }
        
        System.out.println(correctMinute);
    }
}
