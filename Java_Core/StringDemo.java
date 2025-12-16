package Java_Core;

public class StringDemo {
    public static void main(String a[]){
        String name = "Pravin";  // String is a class unlike int, char etc... . Hence here name is a reference variable and by declaring name an object is created automatically.
    // We can also declare it as String name = new String("Pravin");

        //Mutable and Immutable strings
        //Basically strings are immutable , once we create a string object it cannot be changed.
        //Eg:

        String n1 = "navin";
        String n2 = "navin";

        String n3 = "Navin";

        //In above example there are 3 reference variables created which are stored in stack. The names are
        //stored in heap , it first stores "navin" in a random address let's say 101. Now it checks other name which
        //is also navin hence it won't create another name in heap, but the reference variables n1 and n2 in stack
        //are pointed to the same address 101. Next it has "Navin" which is deifferent so it creates another object in
        //heap "Navin" with address 102 and this is pointed by the reference variable n3.

        //Now let's append a name with reddy

        n1 = "navin "+"reddy";

        //Now what happens is n1 is not modified here a new object "navin reddy" will be created in the heap with new
        //address 103 and n1 will now point to 103 instead of 101. Thus the string "navin" is not mutated it is still
        //there inside heap and another object "navin reddy" is created.

        //Mutable strings

        //To mutate strings we can use StringBuffer or StringBuilder methods

        StringBuffer sb = new StringBuffer("Navin");
        System.out.print(sb.capacity()); // String buffer always provides extra 16 bytes of space added with the name that we give
        //The reason is for relocation of the string with buffer space

        System.out.println();
        sb.append(" Reddy");
        sb.deleteCharAt(2);
        sb.insert(6, "Java");
        System.out.println(sb);


        //Difference bet StringBuffer and StringBuilder is that , StringBuffer is thread safe whereas StringBuilder is not
    }
}
