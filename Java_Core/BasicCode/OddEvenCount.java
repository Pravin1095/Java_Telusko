package Java_Core.BasicCode;

public class OddEvenCount {
    public static void main(String[] a){
        OddEvenCount o = new OddEvenCount();
        System.out.println(o.calculateCount(1, 30));
    }

    public String calculateCount(int start, int end){
        int evenCount = 0;
        int oddCount = 0;
        int divCount = 0;

        for(int i=start;i<=end;i++){
            if(i%3==0 && i%5==0){
                divCount+=1;
            }
            if(i%2==0){
                evenCount+=1;
            }
            else if(i%2!=0){
                oddCount+=1;


            }
        }
        return "Even : "+evenCount+"\nOdd: "+oddCount+"\nDivisible by 3 & 5:"+divCount;
    }
}
