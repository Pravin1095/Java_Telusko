package Java_Core.BasicCode.SortingPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//With default the Integer class implements Comparable and hence we are able to us
//Collections.sort(nums) if nums is a List of integers. Similarly if we implement
//Comparable with our StudentAge class and write custom sorting logic inside compareTo
//we can use Collections.sort(studs) when studs is List of StudentAge objects

public class StudentAge implements Comparable<StudentAge> {
    private int age;
    private String name;

    public StudentAge(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentAge{name='" + name + "', age=" + age + "}";
    }

    public int compareTo(StudentAge that){
        if(this.age>that.age){
            return 1;
        }

        else{
            return -1;
        }
    }



//    Collections.sort()


}
