package Java_Core.BasicCode.SortingPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] a){
        StringLength s = new StringLength();

       List<StudentAge> studs = new ArrayList<>();
        studs.add(new StudentAge(28,"Pravin"));
        studs.add(new StudentAge(20,"Navin"));
        studs.add(new StudentAge(30,"Arun"));


        s.addNames("Pravin");
        s.addNames("Lavanya");
        s.addNames("Arun");
        System.out.println(s.sortNamesByLength());

        Collections.sort(studs);
        System.out.println("Sorted students"+studs);
    }
}
