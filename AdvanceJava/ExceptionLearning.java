package AdvanceJava;

class PravinException extends Exception{
    public PravinException(String s){
        super(s);  //Calling Parent(Exception) class's constructor
    }
}

// Exceptions occur during Runtime errors, which occurs suddenly when something in application
// gets failed. We need to handle those exceptions with try and catch blocks
public class ExceptionLearning {
    public static void main(String [] a) {
        int i = 18;
        int j = 2;

        int x = 20;
        int y= 0 ;
        String str = null;
        int nums[] = new int[5];

        try {
            int k = i / j;
            y= i/x;
            if(y==0){
                throw new PravinException("Customizing the output to 1 if it is 0");
            }
            System.out.println(k);
            System.out.println(str.length());
            nums[5] = 0;
        } catch(PravinException e){
            y = i/1;
            System.out.println("Cannot divide by 0 "+e);
        }

        catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0 "+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Please stay in your limits");
        }
        catch(Exception e){
            System.out.println("Something went wrong...  "+e);
        }

        System.out.println("y will be 1 if it is 0 "+y);

        //Multiple catch blocks can be used if we are dealing with different exceptions .
    }
}
