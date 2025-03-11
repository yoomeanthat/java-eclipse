package project;


import java.util.ArrayList;



public class QuizManager {

	public static void main(String[] args) {
		ArrayList<Quiz> easy = new ArrayList<>();
		easy.add(  new Quiz("e1", "ea1"));
		easy.add(  new Quiz("e2","ea2"));
		easy.add(  new Quiz("e3" ,"ea3"));
		
		ArrayList<Quiz> normal = new ArrayList<>();
		normal.add(  new Quiz("nq1", "na1"));
		normal.add(  new Quiz("nq2","na2"));
		normal.add(  new Quiz("nq3" ,"na3"));
		
		ArrayList<Quiz> hard = new ArrayList<>();
		hard.add(  new Quiz("hq1", "ha1"));
		hard.add(  new Quiz("hq2","ha2"));
		hard.add(  new Quiz("hq3" ,"ha3"));
		
		

	}

}
