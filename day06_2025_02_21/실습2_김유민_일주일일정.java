package day06_2025_02_21;

public class 실습2_김유민_일주일일정 {

	public static void main(String[] args) {
		
		String[][] schedule = {
				
				{"기상" , "등교" , "하교" , "운동", "식사"},	
				{"기상" , "등교" , "하교" , "운동", "식사"},
				{"기상" , "등교" , "하교" , "운동", "식사"},
				{"기상" , "등교" , "하교" , "운동", "식사"},
				{"기상" , "등교" , "하교" , "운동", "식사"},
				{"기상" , "등교" , "하교" , "운동", "식사"},
				{"기상" , "등교" , "하교" , "운동", "식사"}
		};
		
		for(int i=0;i<schedule.length;i++) {
			System.out.print((i+1)+"번째 주: ");
			for(int j=0;j<schedule[i].length;j++) {
				System.out.print(schedule[i][j] + " ");
			}System.out.println();
		}

	}

}
