package QuizApp;

import QuizApp.questionService;

public class Main {

     static questionService service  = new questionService();

    public static void main(String[] args) {

        service.display();
    }
}
