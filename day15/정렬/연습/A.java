package day15.정렬.연습;

public class A implements MyComparator {

	@Override
	public int compare(Object o1, Object o2) {
		Score score1 = (Score)o1;
		Score score2 = (Score)o2;
		
		return score1.eng - score2.eng;
	}

}
