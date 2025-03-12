package project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class QuizManager {

    private static ArrayList<Quiz> easy = new ArrayList<>();
    private static ArrayList<Quiz> normal = new ArrayList<>();
    private static ArrayList<Quiz> hard = new ArrayList<>();
    private static Random random = new Random();
    private static Scanner sc = new Scanner(System.in);

    // 퀴즈 파일 로드
    public static void quizSetting() {
        loadQuizzes("res/QuizE.txt", easy);
        loadQuizzes("res/QuizN.txt", normal);
        loadQuizzes("res/QuizH.txt", hard);
    }

    // 퀴즈를 리스트에 추가하는 메서드
    private static void loadQuizzes(String filePath, ArrayList<Quiz> quizList) {
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
                    quizList.add(new Quiz(question, optionsArray, answer));
                }
            }
        } catch (IOException e) {
            System.err.println("Error: Unable to load quizzes from " + filePath);
        }
    }

    // 문제 풀이 메서드 (난이도: 0 = Easy, 1 = Normal, 2 = Hard)
    public static boolean answerCheck(int level) {
        ArrayList<Quiz> selectedList;
        
        switch (level) {
            case 0:
                selectedList = easy;
                break;
            case 1:
                selectedList = normal;
                break;
            case 2:
                selectedList = hard;
                break;
            default:
                System.out.println("잘못된 난이도 선택");
                return false;
        }

        if (selectedList.isEmpty()) {
            System.out.println("더 이상 남은 문제가 없습니다.");
            return false;
        }

        // 랜덤 문제 선택
        Quiz randomQuiz = selectedList.get(random.nextInt(selectedList.size()));
        System.out.println("문제: " + randomQuiz.getQuestion());
        for (int i = 0; i < randomQuiz.getOptions().length; i++) {
            System.out.println((i + 1) + ". " + randomQuiz.getOptions()[i]);
        }

        System.out.print("정답을 입력하시오*(숫자만)*: ");
        String userAnswer = sc.nextLine();

        // 정답 비교
        if (userAnswer.equals(randomQuiz.getAnswer())) {
            System.out.println("정답입니다!");
            quizRemove(randomQuiz, selectedList);
            return true;
        } else {
            System.out.println("틀렸습니다. 유령이 3칸 전진합니다.");
            quizRemove(randomQuiz, selectedList);
            return false;
        }
    }

    // 나온 문제 제거 메서드
    private static void quizRemove(Quiz quiz, ArrayList<Quiz> quizList) {
        quizList.remove(quiz);
    }
}
