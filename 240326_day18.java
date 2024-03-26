// 백준_2024 상반기 전남대학교 PIMM 알고리즘 파티_시계탑
// 문제 : https://www.acmicpc.net/problem/31561

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int inputMinute = scanner.nextInt();
        
        double correctMinute = 0;
        
        if (inputMinute >= 30) {
            correctMinute += 15;
            inputMinute -= 30;
            correctMinute += inputMinute * 1.5;
        } else {
            correctMinute = inputMinute / 2.0;
        }
        
        System.out.println(correctMinute);
    }
}
