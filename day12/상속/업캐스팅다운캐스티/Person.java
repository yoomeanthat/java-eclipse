package day12.상속.업캐스팅다운캐스티;

public class Person {
	
	String name;
	int age;
	

	//생성자
	
	
	//매서드	
	// toString 
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + age;
	}
	
	public void printInfo() {		
		System.out.println( name);
		System.out.println( age);
	}
	

}
