package day11_일정관리실습;

import java.util.ArrayList;
import java.util.Scanner;

public class 일정관리출력3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<일정관리2> s2 = new ArrayList<>(); // ArrayList로만 일정을 관리
        
        loop: while (true) {
            System.out.println("일정관리 프로그램입니다. 일정을 등록해주세요");
            System.out.println("메뉴를 고르시오 1.조회, 2.등록, 3.삭제, 4.변경, 5.종료");
            int menu = sc.nextInt();
            
            switch (menu) {
                
                case 1: // 조회
                    System.out.println("등록된 일정을 조회합니다.");
                    if (s2.isEmpty()) {
                        System.out.println("등록된 일정이 없습니다.");
                    } else {
                        // ArrayList의 내용 출력
                        for (일정관리2 일정 : s2) {
                            일정.출력(); // 일정관리2 클래스에 출력 메서드가 있어야 함
                        }
                    }
                    break;
                
                case 2: // 등록
                    System.out.println("등록할 일정을 입력하시오: ");
                    System.out.print("요일: ");
                    String 요일 = sc.next();
                    System.out.print("일정: ");
                    String 일정 = sc.next();
                    System.out.print("날짜: ");
                    String 날짜 = sc.next();
                    
                    s2.add(new 일정관리2(요일, 일정, 날짜)); // ArrayList에 일정 추가
                    System.out.println("일정이 등록되었습니다.");
                    break;
                
                case 3: // 삭제 
                    System.out.println("삭제할 일정의 요일을 입력하시오: ");
                    String 삭제요일 = sc.next();
                    boolean 삭제됨 = false;
                    for (int i = 0; i < s2.size(); i++) {
                        if (s2.get(i).요일.equals(삭제요일)) {
                            s2.remove(i); // 해당 요일의 일정 삭제
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
                    for (일정관리2 일정1 : s2) {
                        if (일정1.요일.equals(변경요일)) {
                            System.out.print("새 일정: ");
                            String 새일정 = sc.next();
                            System.out.print("새 날짜: ");
                            String 새날짜 = sc.next();
                            일정1.변경(새일정, 새날짜); // 일정관리2 클래스의 변경 메서드 호출
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
