package day14.인터페이스실습2;

import java.util.ArrayList;
import java.util.Scanner;

import day14.인터페이스.나는게가능한;
import day14.인터페이스.많이먹는게가능한;

public class Main2 {
	
	OrderInfo info;
	String pizzaStore;
	String pizza;
	
	String topping1;
	String topping2;
	String result1;
	
	String side1;
	String side2;
	String result2;
	
	ArrayList<화덕에굽는피자>  화덕피자 = new ArrayList<>();
	ArrayList<오븐에굽는피자>  오븐피자 = new ArrayList<>();

	
	public static void main(String[] args) {
		
		
		
		ArrayList<Object> list = new ArrayList<>();
		//오븐피자
		list.add(new 뉴욕스타일피자());
		list.add(new 시카고딥디시());
		list.add(new 프렌치화이트피자());
		//화덕피자
		list.add(new 디아볼라());
		list.add(new 마르게리타());
		list.add(new 퀴트로());
		
		
		
			Main2 m = new Main2();
	
	        for (Object o : list) {
	            if (o instanceof 오븐에굽는피자) {
	                m.오븐피자.add((오븐에굽는피자) o);
	            } else if (o instanceof 화덕에굽는피자) {
	                m.화덕피자.add((화덕에굽는피자) o);
	            }
	        }
	
	        System.out.println("오븐피자:");
	        for (오븐에굽는피자 p : m.오븐피자) {
	            p.오픈에굽기();
	        }
	
	        System.out.println("=================");
	
	        System.out.println("화덕피자:");
	        for (화덕에굽는피자 p : m.화덕피자) {
	            p.화덕에굽기();
	        }
	
	        System.out.println("=================");
	
	        m.order();
	    }
	
	

    public void setOrderInfo(OrderInfo info) {
        this.info = info;
    }
	
//	public void OrderInfo(OrderInfo info) {
//        this.info = info;
//        
//    }
	
	public void order() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("오늘 저녁은 피자입니다. 어느 피자가게에 갈까요??");
		System.out.println("피자헛 VS 도미노");
		
	loop:	while(true) {
			System.out.println("1.피자가게를 정하기, 2.피자메뉴를 입력하기, 3.토핑추가하기, 4.사이드추가하기 5.주문정보출력하기");
			int menu = sc.nextInt();
			
			
			switch(menu) {
			case 1:
				System.out.println("피자 가게를 입력하시오");
                pizzaStore = sc.next();  

                if (pizzaStore.equals("피자헛")) {
                	setOrderInfo(new 피자헛());
                    System.out.println("****피자헛에 오신것을 환영합니다****");
                    
                } else if (pizzaStore.equals("도미노")) {
                	setOrderInfo(new 도미노());
                    System.out.println("****도미노에 오신것을 환영합니다****");
                    
                } else {
                    System.out.println("잘못된 브랜드입니다.");
                }
                break;
                
			case 2:
			    boolean isValidPizza = false;

			    while (!isValidPizza) {
			        System.out.println("피자메뉴를 정해주세요 (오븐피자 또는 화덕피자 목록에 있는 피자만 선택 가능)");
			        pizza = sc.next();
			        
			        
			        for (오븐에굽는피자 op : 오븐피자) {
			            if (op.toString().equals(pizza)) {
			                isValidPizza = true;
			                break;
			            }
			        }

					for (화덕에굽는피자 fp : 화덕피자) {
			                if (fp.toString().equals(pizza)) {
			                    isValidPizza = true;
			                    break;
			                }
			        }


			        if (!isValidPizza) {
			            System.out.println("잘못된 메뉴입니다. 목록에 있는 피자를 다시 입력해주세요.");
			        }
			    }

			    
			    System.out.println(pizza + "를 주문하셨군요. 토핑을 추가해주세요");
			    break;


                
			case 3:
				System.out.println("토핑을 2개 고르세요");
				topping1 = sc.next();
				topping2 = sc.next();
				
				result1 = info.topping(topping1, topping2);
				System.out.println(topping1+"와 "+topping2+"를 추가했습니다 사이드를 추가해주세요");
				System.out.println("===================");
				break;
				
			case 4:
				System.out.println("사이드를 2개 고르세요");
				side1 = sc.next();
				side2 = sc.next();
				
				result2 = info.side(side1, side2);
				System.out.println(side1+"와 "+side2+"를 추가했습니다");
				System.out.println("===================");
				break;
				
			case 5:
				System.out.println("피자가게: "+pizzaStore);
				System.out.println("주문한 피자: "+ pizza);
				System.out.println("토핑: " +topping1+"와 " +topping2);
				System.out.println("사이드메뉴: "+side1+"와 " +side2);
				System.out.println("주문하신메뉴 나왔습니다~~");
				break loop;
				
				
			default:
				System.out.println("잘못된 메뉴 입력");
				
			}
		}
	}
	
	
	

}
