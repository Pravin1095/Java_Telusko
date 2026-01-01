package AdvanceJava;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;


//class Student implements Comparable<Student>
class Student
{
    int age;
    String name;

    public Student(int age, String name)
    {
        this.age=age;
        this.name=name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" +name +"]";
    }

//	public int CompareTo(Student that)
//	{
////		return 0;
//		if(this.age >that.age)
//			return 1;
//		else
//			return -1;
//	}
}


public class Comparator_vs_Comparable {
    public static void main(String[] args){


        //Comparator is used to swap the values in the list as per our requirements. Here when we
        //returned 1 , it swaps and -1 it doesn't . Here we are sorting the numbers based on
        //the second digit of the number

        //It is basically a functional interface that has compare method as abstract method, that
        // helps us to sort the list to our custom needs
//    	Comparator<Integer> com=new Comparator<Integer>()
//    	{
//    		public int compare(Integer i,Integer j)
//    		{
//    			if(i%10 >j%10)
//    				return 1;
//    			else
//    				return -1;
//    		}
//    	};

//    	List<Integer> nums= new ArrayList<>();
//    	nums.add(43);
//    	nums.add(31);
//    	nums.add(72);
//    	nums.add(29);

//    	Comparator<Student> com=new Comparator<Student>()
//    	{
//    		public int compare(Student i,Student j)
//    		{
//    			if(i.age >j.age)
//    				return 1;
//    			else
//    				return -1;
//    		}
//    	};

        Comparator<String> comstr = (String i, String j) ->{
           return i.length()>j.length() ? 1 : -1;
        };


        List<String> words = new ArrayList<>();
        words.add("car");
        words.add("bike");
        words.add("truck");
        words.add("aeroplane");

        Collections.sort(words, comstr);
        System.out.println(words);

        Comparator<Student> com=(i,j) -> i.age > j.age?1:-1;

        List<Student> studs= new ArrayList<>();
        studs.add(new Student(21,"Navin"));
        studs.add(new Student(12,"John"));
        studs.add(new Student(18,"Parul"));
        studs.add(new Student(20,"Kiran"));

//    	Collections.sort(nums);
//    	System.out.println(nums);

        for(Student s:studs)
            System.out.println();

        Collections.sort(studs, com);  //Finally pass the comporator obj to Collections.sort
        for(Student s: studs)
            System.out.println(s);
    }
}
