package day14.인터페이스.계산기인터페이스;

public class SMCalculator implements Calculator{
	
	@Override
	public int add(int su1, int su2) {
		System.out.println("SM add");
		return su1+su2;
	}

	@Override
	public int sub(int su1, int su2) {
		System.out.println("SM sub");
		return su1-su2;
	}
}
