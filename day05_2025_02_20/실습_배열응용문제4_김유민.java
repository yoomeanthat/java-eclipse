package day05_2025_02_20;

public class 실습_배열응용문제4_김유민 {

    public static void main(String[] args) {
        
        String [][] students = {
                {"가","나","다","라","마"},
                {"바","사","아","자","차"},
                {"카","타","파","하","야"},
                {"어","여","오","요","우"},
                {"유","으","이","구","십"}
        };
        
        System.out.println(" * * * * * * ");
        for(int i=0; i<5; i++) {
        	System.out.print("*");
            for(int j=0; j<5; j++) {
                System.out.print(students[i][j] + " ");  // 한 줄에 출력
            }
            System.out.print("*");
            System.out.println();  // 한 행이 끝난 후 줄바꿈
        }
        
        System.out.print(" * * * * * * ");
    }
}
