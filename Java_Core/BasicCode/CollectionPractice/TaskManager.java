package Java_Core.BasicCode.CollectionPractice;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<String> tasks = new ArrayList<>();
    private Integer num = 5;



    public boolean addTasks(String task){
        if(task==null){
            return false;
        }
        String trimmedTask = task.trim();
        if(trimmedTask.isEmpty()){
            return false;
        }
        for(String existing : this.tasks){
            if(existing.equalsIgnoreCase(task)){
                return false;
            }
        }
        this.tasks.add(task);
        return true;
    }

    public boolean completeTask(String task){
        for(int i=0;i<this.tasks.size();i++){
            if(this.tasks.get(i).equalsIgnoreCase(task)){
                this.tasks.remove(i);
                return true;
            }
        }

        return false;
    }

    public int getTaskCount(){
        return tasks.size();
    }

    public void printAllTasks(){
        if(this.getTaskCount()==0){
            System.out.println("No Pending tasks");
        }
        else{
            int i=1;

            for(String s:this.tasks){
                System.out.println(i+". "+s);
                i+=1;
            }

        }

    }

//    public List<String> getTasks(){
//        return this.tasks;
//    }
}
