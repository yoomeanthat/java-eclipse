package day09_2025_02_26;

public class 자판기출력 {

	public static void main(String[] args) {
		
		자판기 s = new 자판기();
		s.beverageInfo("데미소다", 1000, 500, 300, "사과맛", "농심", "2025-02-26");
		
		자판기 s2 = new 자판기();
		s2.beverageInfo("파워에이드", 1500, 700, 100, "레몬에이드", "오리온", "2025-02-27");
		
		
		자판기 s3 = new 자판기();
		s3.snackInfo("포스틱", 1700, 100, 30, "감자", "오리온", "2025-02-28");
		
		자판기 s4 = new 자판기();
		s4.snackInfo("양파링", 1300, 80, 20, "양파", "농심", "2025-02-27");
		
		s.beverageInfoOut();
		s2.beverageInfoOut();
		s3.snackInfoOut();
		s4.snackInfoOut();
	}

}
