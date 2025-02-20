package day05_2025_02_20;

import java.util.Scanner;

public class 짝수배열문제2 {

    public static void main(String[] args) {

    	
    	
    	
        // 1차 배열 (정수형 배열 최대 10개 준비)
        int[] numbers = new int[10];
        int count = 0; // 입력된 숫자의 개수를 셀 변수

        // 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

        // 숫자 입력 받기
        System.out.println("숫자를 입력하세요. 0을 입력하면 종료됩니다:");

        // 숫자 입력 받기 (0이 입력되면 종료)
        while (true) {
            int input = sc.nextInt(); // 숫자 입력받기

            if (input == 0) { // 0 입력 시 종료
                break;
            }

            if (count < 9) { // 배열 크기 10개 제한
                numbers[count] = input;
                count++; // 입력된 숫자의 개수 증가
            } else {
                System.out.println("더 이상 입력할 수 없습니다.");
                break;
            }
        }

        // 입력된 숫자들 출력하기
        System.out.println("입력된 숫자들은:");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " "); // 배열의 각 요소 출력
        }
    }
}
