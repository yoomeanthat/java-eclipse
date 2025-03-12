package Project2;

class Quiz {
    private String question;
    private String[] options;
    private String answer;

    public Quiz(String question, String[] options, String answer) {
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        StringBuilder optionsString = new StringBuilder();
        for (String option : options) {
            optionsString.append(option).append(" ");
        }
        return "Question: " + question + "Options: " + optionsString + "Answer: " + answer;
    }
}