package Java_Core.Generics;

import java.util.ArrayList;

public class ScoreList<T> {
    ArrayList<T> scoreList = new ArrayList<>();
    public void addElement(T element){
        scoreList.add(element);
    }

    public void removeElement(T element){
        scoreList.remove(element);
    }
}
