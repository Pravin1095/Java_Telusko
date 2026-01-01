package AdvanceJava;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

class StudentStream{
    String name;
    int age;
    public StudentStream(String name){
        this.name = name;
    }
}

//Stream is an interface which gives us to use methods like map, filter and reduce
//We cannot reuse already used stream again
public class StreamAPILearning {
    public static void main(String[] a){
        //forEach is a method that accepts object of Consumer interface
        //This interface is a functional interface that has accept method in it and
        //that method accepts an integer n and we can do whatever we can with it
        List<Integer> nums = Arrays.asList(4, 6, 7, 8);
        Consumer com = (n)->System.out.println(n);

//        nums.forEach(com);
        //The above statement can be written as below as well
        nums.forEach( n->System.out.println(n));


        //Just like forEach that uses Consumer , filter uses Predicate functional interface
        //that has a boolean method that returns true or false for each n and returns n if
        //n is true
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2==0);
        int result = s2.reduce(0, (c,e)->c+e);
        System.out.println(result);

        int result2 = nums.stream().filter(n->n%2==0).reduce(0, (c,e)->c+e);
        System.out.println(result2);


        //Parallel Stream

        int size = 10_000;
        List <Integer> numsParallel = new ArrayList<>(size);
        Random ran = new Random();
        for(int i=1;i<=10000;i++){
            numsParallel.add(ran.nextInt(100));  // Generates random numbers from 1 to 100
        }
        System.out.println(numsParallel);

        //mapToInt returns an object of IntegerStream class and that objects contains various
        //operations methods like sum

//        long startSeq2 = System.currentTimeMillis();
//        int sum2 = numsParallel.stream().map(i->{
//            try{
//                Thread.sleep(1);
//            }
//            catch(Exception e) {
//
//            }
//            return i*2;
//
//        }).mapToInt(i->i).sum();
//        long endSeq2 = System.currentTimeMillis();
//        System.out.println("Sum :"+sum2+" Time:"+(endSeq2-startSeq2));


        //Parallel stream creates threads and does our operations parallely reducing the delay
        //Here we puprposely added some delay, so while delay is happening parallel stream does
        //our operations of creating threads and performs faster operation.

//        long startSeq3 = System.currentTimeMillis();
//        int sum3 = numsParallel.parallelStream().map(i->{
//            try{
//                Thread.sleep(1);
//            }
//            catch(Exception e) {
//
//            }
//            return i*2;
//
//        }).mapToInt(i->i).sum();
//        long endSeq3 = System.currentTimeMillis();
//        System.out.println("Sum :"+sum3+" Time:"+(endSeq3-startSeq3));



        //Optional Class

        List <String> names = Arrays.asList("Pravin", "Laxmi", "Navinx", "Kishore");

//        Optional<String> name = names.stream().filter(str -> str.contains("x")).findFirst();
//
//        System.out.println(name.orElse("Not Found"));

        // The above can also be written as follows:

        String name = names.stream().filter(str->str.contains("x")).findFirst().orElse("Not Found");

        System.out.println(name);


        //Method Reference

        List <String> names1 = Arrays.asList("Navin" ,"Pravin", "John");
//        List <String> unames = names1.stream().map(n->n.toUpperCase()).toList();  //toList returns in List format
        List <String> unames = names1.stream().map(String::toUpperCase).toList();  //Method reference is defining a method witb
        //two colons with className to which that method belongs in front of it. Eg: String::toUpperCase , System.out::println
        unames.forEach(System.out::println); //Here forEach provides each name and with method reference we can print it


        //Constructor reference

        List <String> cNames = Arrays.asList("Navin", "Pravin", "Harsh");
        List <StudentStream> students = new ArrayList<>();
        students = cNames.stream().map(StudentStream::new).toList();  //Creates objects for each student

        System.out.println(students.get(0).name);

    }




}
