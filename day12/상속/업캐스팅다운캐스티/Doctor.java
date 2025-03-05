package day12.상속.업캐스팅다운캐스티;

public class Doctor extends  Person {
	
	public Doctor(String name, int age) {
		super(name, age);
		
	}

	public void treat() {
		System.out.println("의사가 치료한다");
	}

}
