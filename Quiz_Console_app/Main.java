package Quiz_Console_app;

public class Main {
    public static void main(String[] args){
        QuestionService q = new QuestionService();
        q.displayQuestions();
        q.printScore();

    }
}

//void main(){
//    IO.println("Hrllo world");
//}
