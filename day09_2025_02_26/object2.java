package day09_2025_02_26;

import java.util.Scanner;

public class object2 {
	int id;
	String name;
	int count;
	int price;
	
	
	//public static void setObject(object2 obj)
	public void setObject() {	//object2 this
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		this.id = sc.nextInt();
		System.out.print("이름 입력 : ");
		this.name = sc.next();
		System.out.print("개수 입력 : ");
		this.count = sc.nextInt();
		System.out.print("가격 입력 : ");
		this.price = sc.nextInt();
	}
	//public static void printObject(object2 obj)
	public void printObject() {		//object2 this
		System.out.println("아이디 : " + this.id);
		System.out.println("이름 : " + this.name);
		System.out.println("개수 : " + this.count);
		System.out.println("가격 : " + this.price);
	}
}
