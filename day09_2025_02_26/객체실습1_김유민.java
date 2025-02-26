package day09_2025_02_26;

public class 객체실습1_김유민 {
	
	String name;
	int age;
	boolean marry;
	int child;
	
	
	
	public void input(String name, int age, boolean marry, int child) {
		
		this.name = name;
		this.age = age;
		this.marry = marry;
		this.child = child;
	}
	
	public void printInfo() {
		System.out.println("이름: "+this.name);
		System.out.println("나이: "+this.age);
		System.out.println("결혼 여부: "+this.marry);
		System.out.println("아이는 "+this.child+"명 있습니다");
	}
	
}
