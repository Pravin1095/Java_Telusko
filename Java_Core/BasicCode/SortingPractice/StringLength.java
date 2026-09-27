package Java_Core.BasicCode.SortingPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringLength {
    private List<String> names = new ArrayList<>();

    public List<String> getNames() {
        return names;
    }

    public void addNames(String names) {
        this.names.add(names);
    }

    //Sorting based on length of string
    public List<String> sortNamesByLength(){
        Comparator<String> com = (String i, String j)->{
            if(i.length()>j.length()){
                return 1;  //returning 1 swaps the list, initially it
                //compares first two elements in list "Pravin" and "Lavanya"
                //returns -1 and as Pravin length is lower and does not swap
            }
            else{
                return -1; //returning -1 does not swap
            } //We use comparator to customize our sorting
        };
        Collections.sort(names, com);
        return this.names;
    }
}
