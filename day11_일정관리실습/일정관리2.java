package day11_일정관리실습;

class 일정관리2 {
    String 요일;
    String 일정;
    String 날짜;
    
    public String toString() {
    	return 요일 + "  " + 일정 + "  " + 날짜;
    }

    // 생성자
    public 일정관리2(String 요일, String 일정, String 날짜) {
        this.요일 = 요일;
        this.일정 = 일정;
        this.날짜 = 날짜;
    }

    // 일정 정보 출력
    public void 출력() {
        System.out.println(요일 + ": " + 일정 + " (" + 날짜 + ")");
    }

    // 일정 정보 변경
    public void 변경(String 일정, String 날짜) {
        this.일정 = 일정;
        this.날짜 = 날짜;
    }
}
