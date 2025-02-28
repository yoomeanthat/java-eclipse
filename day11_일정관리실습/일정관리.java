package day11_일정관리실습;


class 일정관리 {
	
	
	String 요일;
	String 일정;
	String 날짜;
	int num;
	
	public String toString(){
		return 요일 +"   "+ 일정 +"   "+날짜;
	}
	
	public 일정관리(String 요일, String 일정, String 날짜) {
		this.요일 = 요일;
		this.일정 = 일정;
		this.날짜 = 날짜;
	}

	public void 출력() {
		System.out.println(요일 + ": " + 일정 + " (" + 날짜 + ")");
		
	}

	public void 변경(String 일정, String 날짜) {
		this.일정 = 일정;
        this.날짜 = 날짜;
		
	}
	
	
}
