package Java_Core.BasicCode.DSA;

import java.util.List;

public class Main {
    public static void main(String[] a){
        //aabbcddeff
        //Input: s = "geeksforgeeks"Output:'f' f is the first unique character that is not repeating
        FrequencyCount f = new FrequencyCount();

        List<String> fruits = List.of("apple", "banana", "apple", "orange", "banana", "apple");
        System.out.println(f.countFrequency(fruits));
    }
}
