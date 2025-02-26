package day09_2025_02_26;

import java.util.Scanner;

public class 자판기2 {
	
	String name;
	int price;
	double volume;
	double calories;
	String taste;
	int change;
	int money;
	
	String manufacture;
	String expDate;
	
	
	public void beverageInfo(String name, int price, double volume, double calories, String taste, String manufacture, String expDate) {
		this.name = name;
		this.price = price;
		this.volume = volume;
		this.calories = calories;
		this.taste = taste;
		this.manufacture = manufacture;
		this.expDate = expDate;
	}
	
	public void snackInfo(String name, int price, double volume, double calories, String taste, String manufacture, String expDate) {
		this.name = name;
		this.price = price;
		this.volume = volume;
		this.calories = calories;
		this.taste = taste;
		this.manufacture = manufacture;
		this.expDate = expDate;
	}
	
	public int calc() {
		change = money-price;
		return change;
	}
	
	public void beverageInfoOut() {
		Scanner sc = new Scanner(System.in);
		System.out.println("얼마를 넣으시겠습니까?");
		money = sc.nextInt();
		System.out.println("구매할 제품을 골라주세요(음료:데미소다, 파워에이드/ 과자:포스틱, 양파링");
		sc.next();
		System.out.println("거스름돈은: "+calc()+" 입니다");
		System.out.println("음료이름: "+this.name);
		System.out.println("음료가격: "+this.price);
		System.out.println("음료용량: "+this.volume);
		System.out.println("음료열량: "+this.calories);
		System.out.println("음료 맛: "+this.taste);
		System.out.println("제조회사: "+this.manufacture);
		System.out.println("유통기한: "+this.expDate);
	}
	
	public void snackInfoOut() {
		Scanner sc = new Scanner(System.in);
		System.out.println("얼마를 넣으시겠습니까");
		money = sc.nextInt();
		System.out.println("구매할 제품을 골라주세요(음료:데미소다, 파워에이드/ 과자:포스틱, 양파링");
		sc.next();
		System.out.println("거스름돈은: "+calc()+" 입니다");
		System.out.println("음료이름: "+this.name);
		System.out.println("음료가격: "+this.price);
		System.out.println("음료용량: "+this.volume);
		System.out.println("음료열량: "+this.calories);
		System.out.println("음료 맛: "+this.taste);
		System.out.println("제조회사: "+this.manufacture);
		System.out.println("유통기한: "+this.expDate);
	}
	
	
}
