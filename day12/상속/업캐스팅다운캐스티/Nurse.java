package day12.상속.업캐스팅다운캐스티;

public class Nurse  extends Person{
	
	public Nurse(String name, int age) {
		super(name, age);
		
	}

	public void care() {
		System.out.println("환자를 돌본다");
	}

}
