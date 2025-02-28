package day11_일정관리실습;

import java.util.ArrayList;
import java.util.Scanner;

public class 일정관리출력2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<일정관리2> s2 = new ArrayList<>(); 
        일정관리2[] s = new 일정관리2[5];
        
        // 초기 일정 설정
//        s[0] = new 일정관리2("월요일", "수학공부", "3월3일");
//        s[1] = new 일정관리2("화요일", "국어공부", "3월4일");
//        s[2] = new 일정관리2("수요일", "영어공부", "3월5일");
//        s[3] = new 일정관리2("목요일", "물리공부", "3월6일");
//        s[4] = new 일정관리2("금요일", "화학공부", "3월7일");
        
        loop: while (true) {
            System.out.println("일정관리 프로그램입니다. 일정을 등록해주세요");
            System.out.println("메뉴를 고르시오 1.조회, 2.등록, 3.삭제, 4.변경, 5.종료");
            int menu = sc.nextInt();
            
            switch (menu) {
                
                case 1: // 조회
                    System.out.println("등록된 일정을 조회합니다.");
//                    for (int i = 0; i < s.length; i++) {
//                        s[i].출력();
//                    }
                    
                    System.out.println(s2.toString());
                    break;
                
                case 2: // 등록
                    System.out.println("등록할 일정을 입력하시오: ");
                    System.out.print("요일: ");
                    String 요일 = sc.next();
                    System.out.print("일정: ");
                    String 일정 = sc.next();
                    System.out.print("날짜: ");
                    String 날짜 = sc.next();
                    
                    s2.add(new 일정관리2(요일, 일정, 날짜));
                    // 배열에 등록
//                    for (int i = 0; i < s.length; i++) {
//                        if (s[i] == null) {
//                            s[i] = new 일정관리2(요일, 일정, 날짜);
//                            System.out.println("일정이 등록되었습니다.");
//                            break;
//                        }
//                    }
                    break;
                
                case 3: // 삭제
                    System.out.println("삭제할 일정의 요일을 입력하시오: ");
                    String 삭제요일 = sc.next();
                    boolean 삭제됨 = false;
                    for (int i = 0; i < s.length; i++) {
                        if (s[i] != null && s[i].요일.equals(삭제요일)) {
                            s[i] = null;
                            System.out.println(삭제요일 + "의 일정이 삭제되었습니다.");
                            삭제됨 = true;
                            break;
                        }
                    }
                    if (!삭제됨) {
                        System.out.println("해당 요일의 일정이 없습니다.");
                    }
                    break;
                
                case 4: // 변경
                    System.out.println("변경할 일정의 요일을 입력하시오: ");
                    String 변경요일 = sc.next();
                    boolean 변경됨 = false;
                    for (int i = 0; i < s.length; i++) {
                        if (s[i] != null && s[i].요일.equals(변경요일)) {
                            System.out.print("새 일정: ");
                            String 새일정 = sc.next();
                            System.out.print("새 날짜: ");
                            String 새날짜 = sc.next();
                            s[i].변경(새일정, 새날짜);
                            System.out.println("일정이 변경되었습니다.");
                            변경됨 = true;
                            break;
                        }
                    }
                    if (!변경됨) {
                        System.out.println("해당 요일의 일정이 없습니다.");
                    }
                    break;
                
                case 5: // 종료
                    System.out.println("프로그램을 종료합니다.");
                    break loop;
                
                default:
                    System.out.println("잘못된 메뉴입니다. 다시 선택하세요.");
            }
        }
        sc.close();
    }
}