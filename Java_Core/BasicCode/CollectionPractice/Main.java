package Java_Core.BasicCode.CollectionPractice;

public class Main {
    public static void main(String[] a){
        TaskManager task = new TaskManager();
        task.addTasks("Attend Interview");
        task.addTasks("Attend Interview");
        task.addTasks("          ");
        task.addTasks(null);
        task.addTasks("Please clear the interview!");
        task.completeTask("Clear");
        task.printAllTasks();
    }
}
