package Quiz_Console_app;

import java.util.Scanner;

public class QuestionService {
    Questions[] questions = new Questions[5];
    String selection[] =new String [5];

    public QuestionService(){
        questions[0] = new Questions(
                1,
                "What is Java?",
                "Programming Language",
                "Database",
                "Operating System",
                "Browser",
                "Programming Language"
        );

        questions[1] = new Questions(
                2,
                "Which keyword is used to inherit a class in Java?",
                "this",
                "super",
                "extends",
                "implements",
                "extends"
        );

        questions[2] = new Questions(
                3,
                "Which collection does not allow duplicates?",
                "List",
                "Set",
                "Map",
                "Array",
                "Set"
        );

        questions[3] = new Questions(
                4,
                "What is the size of int in Java?",
                "2 bytes",
                "4 bytes",
                "8 bytes",
                "Depends on OS",
                "4 bytes"
        );

        questions[4] = new Questions(
                5,
                "Which method is the entry point of a Java program?",
                "start()",
                "main()",
                "run()",
                "execute()",
                "main()"
        );
    }
int i=0;
    public void displayQuestions(){
        for(Questions q : questions){
            System.out.println("Question no. : "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i+=1;
        }

        for(String s : selection){
            System.out.println(s);
        }
    }

    public void printScore(){
        int score = 0;
        for(int i=0;i< questions.length;i++){
            Questions q = questions[i];
            String actualAnswer = q.getAnswer();
            String userAnswer = selection[i];
            if(actualAnswer.equals(userAnswer)){
                score+=1;
            }

        }
        System.out.println("Total Score : "+score);

    }
}


