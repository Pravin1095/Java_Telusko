package Java_Core.BasicCode;

public class SecondLargest {

    public int secondLarge(int[] numbers){
int max = Integer.MIN_VALUE;
int smax = Integer.MIN_VALUE;
for(int i=0;i< numbers.length;i++){
    if(numbers[i]>max){
        smax = max;
        max = numbers[i];

    }
    else{
        if(numbers[i]<max && smax<numbers[i]){
            smax = numbers[i];
        }

    }

}
        return smax;
    }
}
