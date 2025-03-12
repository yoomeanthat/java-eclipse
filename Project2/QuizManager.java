package Project2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//import Project2.Quiz;

public class QuizManager {

	static ArrayList<Quiz> easy = new ArrayList<>();
	static ArrayList<Quiz> normal = new ArrayList<>();
	static ArrayList<Quiz> hard = new ArrayList<>();

	// 문제들 불러오기
	public static void quizSetting(int num) {
		String filePath = "";
		ArrayList<Quiz> targetList = null;

		// 난이도에 따라 파일 경로 및 저장 리스트 선택
		switch (num) {
		case 0:
			filePath = "res/easy.txt";
			targetList = easy;
			break;
		case 1:
			filePath = "res/normal.txt";
			targetList = normal;
			break;
		case 2:
			filePath = "res/hard.txt";
			targetList = hard;
			break;
		default:
			System.err.println("잘못된 난이도입니다.");
			break;
		}

		// 파일에서 문제들 불러와서 ArrayList에 저장
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = br.readLine()) != null) {
				if (line.startsWith("Q.")) {
					String question = line.substring(2);
					ArrayList<String> optionsList = new ArrayList<>();
					String answer = "";

					while ((line = br.readLine()) != null && !line.startsWith("A. :")) {
						optionsList.add(line);
					}

					if (line != null && line.startsWith("A. :")) {
						answer = line.substring(4);
					}

					String[] optionsArray = optionsList.toArray(new String[0]);
					targetList.add(new Quiz(question, optionsArray, answer));
				}
			}
		} catch (FileNotFoundException e) {
			System.err.println("Error: File not found. (" + filePath + ")");
		} catch (IOException e) {
			System.err.println("Error: Unable to read the file. (" + filePath + ")");
		}
	}

	// 파일에서 불러온 문제를 푼 뒤 실패하면 false 성공하면 true
	public static boolean answerCheck(int level) {
        ArrayList<Quiz> quizzes;
        switch (level) {
            case 0:
                quizzes = easy;
                break;
            case 1:
                quizzes = normal;
                break;
            case 2:
                quizzes = hard;
                break;
            default:
                System.out.println("잘못된 난이도입니다.");
                return false;
        }
        
       
        //플레이어가 정답을 입력하는 부분
        //정해진 난이도 안에서 나오지만 문제는 random으로 나온다
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        // 하나의 문제만 처리
        Quiz randomQuiz = quizzes.get(random.nextInt(quizzes.size()));

        System.out.println("문제: " + randomQuiz.getQuestion());
        for (int i = 0; i < randomQuiz.getOptions().length; i++) {
            System.out.println(randomQuiz.getOptions()[i]);
        }

        System.out.print("정답을 입력하시오: ");
        String userAnswer = sc.nextLine();

        if (userAnswer.equals(randomQuiz.getAnswer())) {
            System.out.println("정답입니다!");
            return true; // 문제를 맞추면 true 반환
        } else {
            System.out.println("틀렸습니다. 유령이 3칸 전진합니다.");
            return false;
            } // 문제를 틀리면 false 반환
        }

	public static void quizRemove(Quiz quiz, ArrayList<Quiz> quizzes) {
		quizzes.remove(quiz);
	}

}
