package Java_Core.BasicCode.StringProblems;

public class Main {
    public static void main(String[] a){
        ConsonantsVowelsCount c = new ConsonantsVowelsCount();
        EmailValidator e = new EmailValidator();
//        System.out.println(c.calculateCount("Hello World!"));
        System.out.println(e.isValidEmail("a..pravin3210@gmail.com"));
        System.out.println(e.isValidEmail("a.pravin3210.@gmail.com"));

        ;
    }
}
