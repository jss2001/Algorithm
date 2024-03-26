// 문제 : https://www.acmicpc.net/problem/31561 시계탑

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
