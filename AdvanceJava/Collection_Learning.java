package AdvanceJava;

import java.util.*;

public class Collection_Learning {
    public static void main(String[] a){

        //Collection is a concept where we can store data as a List , Set or Queue.
        //Collection is an interface and many classes implements it.
        //Here we have taken ArrayList but haven't mentioned the type of values that it
        //has to store. If we don't mention Collection <Integer> nums = new ArrayList<Integer>();
        //then it stores the values as objects instead of the datatype that we expect.
        //This concept of defining the datatype is Generics. It is always safe to mention type
        //else we can store any datatype we want and there won't be compile time error.

        //Note we can't access index as we doin in array in Collection interface, instead use List
        //which is implemented by ArrayList. List has a get method to access index
//        Collection <Integer> nums = new <Integer> ArrayList();
        List<Integer> nums = new <Integer> ArrayList();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        System.out.println(nums);
        System.out.println("List Value "+nums.get(2));
        System.out.println("Index Value "+nums.indexOf(4));
        for(int n: nums){
            System.out.println(n);
        }
        Iterator<Integer> values = nums.iterator();
        while(values.hasNext())
            System.out.println("Iterator class iteration "+values.next());




        //Set stores only unique values and we cannot have index for it.
        //If we want to get sorted set use TreeSet instead of HashSet
        Set<Integer> uniqueNums = new HashSet<Integer>();
        uniqueNums.add(1);
        uniqueNums.add(2);
        uniqueNums.add(3);
        uniqueNums.add(4);
        uniqueNums.add(4);

        System.out.println(uniqueNums);


        //In Map the keys are unique so adding Harsh again just changes the value
        Map <String, Integer>students = new HashMap<>();

        students.put("Navin", 23);
        students.put("Harsh", 56);
        students.put("Pravin", 99);
        students.put("Sushil", 53);
        students.put("Harsh", 76);

        System.out.println(students);
        System.out.println(students.keySet());
        System.out.println(students.get("Navin"));

        for(String stu : students.keySet()){
            System.out.println(stu+":"+students.get(stu));
        }

    }
}
