package day15.정렬.연습;

public class Score implements MyComparable {
	String name;
	int kor;
	int eng;
	double avg;
	
	public Score() {
	}
	public Score(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
		calcAvg();
	}
	
	public void calcAvg() {
		int total = kor + eng;
		avg = total / 2.0;
	}
	
	@Override
	public String toString() {
		return "[name=" + name + ", kor=" + kor + ", eng=" + eng + ", avg=" + avg + "]";
	}
	
	@Override
	public int compareTo(Object obj) { //국어 오름차순
		Score score = (Score)obj;
		return this.kor - score.kor;
	}
	
}

