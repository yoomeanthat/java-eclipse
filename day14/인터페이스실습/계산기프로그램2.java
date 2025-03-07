package day14.인터페이스실습;

import java.util.Scanner;

public class 계산기프로그램2 {
    
    Calculator calculator;
    String brand;
    int result1 = 0; 
    int result2 = 0;
    
    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
        
    }
    
    public void run() {
        
        
//        System.out.println("메뉴를 입력하세요");
//        String temp = sc.next();
        
        System.out.println("======두 분이서 오셨군요 메뉴를 두 개 주문해주세요======");
        System.out.println();
        
        while(true) {
        	System.out.println("메뉴를 입력하시오 1.브랜드입력, 2.칼로리입력, 3.가격입력 4.주문정보출력 5.종료");
        	Scanner sc = new Scanner(System.in);
        	int menu = sc.nextInt();
        	
        	switch (menu) {
     
            case 1:
            	System.out.println("햄버거 브랜드를 입력하시오");
                brand = sc.next();  

                if (brand.equals("버거킹")) {
                    setCalculator(new 버거킹());
                    System.out.println("****버거킹에 오신것을 환영합니다****");
                } else if (brand.equals("맘스터치")) {
                    setCalculator(new 맘스터치());
                    System.out.println("****맘스터치에 오신것을 환영합니다****");
                } else {
                    System.out.println("잘못된 브랜드입니다.");
                }
                break;
                
            case 2:
            	System.out.println("햄버거의 칼로리를 두 개 입력하시오");
                int cal1 = sc.nextInt();
                int cal2 = sc.nextInt();
//                
//              
                result1 = calculator.add(cal1, cal2);
                System.out.println("햄버거 두 개의 칼로리 합은: " + result1 + "kcal입니다");
                break;
                
            case 3:
            	System.out.println("햄버거 두 개의 가격을 입력하시오");
            	int price1 = sc.nextInt();
                int price2 = sc.nextInt();
//                
                result2 = calculator.price(price1, price2);
                System.out.println("햄버거 두 개의 가격의 합은: " + result2 + "원입니다");
                break;
                
            case 4:
            	System.out.println("주문하신 정보는 *"+ brand +"*브랜드이고 " +"칼로리의 합은 *"+ result1 + "kcal* 가격은 *"+result2 +"*원입니다");
            	break;
            	
            case 5:
            	System.out.println("주문을 종료합니다");
            	break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
            }
        }
        
 
    }

    public static void main(String[] args) {
        
        계산기프로그램2 p = new 계산기프로그램2();
        p.run();
    }
}
