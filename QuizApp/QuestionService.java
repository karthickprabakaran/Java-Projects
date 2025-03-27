package QuizApp;

public class QuestionService {
    Question[] questions = new Question[5];

    QuestionService(){
        questions[0] = new Question(0, "Which is the fastest language", "java", "python", "java Script", "Go", "Java");
        questions[1] = new Question(0, "Which is the Easiest language", "java", "python", "java Script", "Go", "Java");
        questions[2] = new Question(0, "Which is the Longest language", "java", "python", "java Script", "Go", "Java");
        questions[3] = new Question(0, "Which is the Hardest language", "java", "python", "java Script", "Go", "Java");
        questions[4] = new Question(0, "Which is the Slowest language", "java", "python", "java Script", "Go", "Java");

    }
    public void displayQuestions() { // Fixed the method name
        for(Question q: questions)
        {
            System.out.println(q);
        }
    }
}