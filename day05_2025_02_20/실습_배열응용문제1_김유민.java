package day05_2025_02_20;

import java.util.Scanner;

public class 실습_배열응용문제1_김유민 {

    public static void main(String[] args) {

        // 크기가 10인 배열 생성
        int[] numbers = new int[10];
        int count = 0; // 입력된 짝수의 개수 카운트

       
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요. 0을 입력하면 종료됩니다:");

        // 수 입력 받기 (0이 입력되면 종료)
        while (count < 10) {
            int input = sc.nextInt(); // 숫자 입력받기

            if (input == 0) { // 0 입력 시 종료
                break;
            }

            // 짝수일 경우에만 배열에 저장
            if (input % 2 == 0) {
                numbers[count] = input; // 짝수 배열에 저장
                count++; // 짝수 개수 증가
            }
        }

        // 저장된 짝수 출력하기
        System.out.println("입력된 짝수는:");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " "); // 배열의 각 요소 출력
        }
    }
}
