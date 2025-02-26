package day09_2025_02_26;

public class 객체실습3_김유민2 {
	
	String name;
	int kor;
	int eng;
	int avg;
	
	public void input(String name, int kor, int eng) {
		
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
	}
	
	public void calc() {
		avg = (kor+eng)/2;
	}
	
	public void printInfo() {
		System.out.println("이름: "+this.name);
		System.out.println("국어점수: "+this.kor);
		System.out.println("영어점수: "+this.eng);
		System.out.println("평균은: "+this.avg);
	}
	
}
