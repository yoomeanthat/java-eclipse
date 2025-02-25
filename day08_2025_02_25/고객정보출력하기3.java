package day08_2025_02_25;

public class 고객정보출력하기3 {

	public static void main(String[] args) {
		
		Customer c= new Customer();
		c.name="김유민";
		c.address="서울시 양천구";
		c.school="홍익대";
		c.grade="4학년";
		c.email="yoomeani1214@gmail.com";
		c.age =27;
		c.bornyear=1999;
		
		printInfo(c);

	}
	
	
	public static void printInfo(Customer c) {
		
		 System.out.println(c.name);
		 System.out.println(c.address);
		 System.out.println(c.school);
		 System.out.println(c.grade);
		 System.out.println(c.email);
		 System.out.println(c.age);
		 System.out.println(c.bornyear);
		 
		 
	}

}

