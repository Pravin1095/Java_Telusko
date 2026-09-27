package Java_Core.BasicCode;

public class Main {
    public static void main(String[] args) {
//        TemperatureCheck temp = new TemperatureCheck();
//        temp.setTemperature(96.75);
//        System.out.println(temp.temperatureCondition());

//        LeapYear leap = new LeapYear();
//        leap.setYearAndMonth(2024,2);
//        System.out.println(leap.DayCount());

//        int[] numbers = {12, 35, 1, 10, 34, 1};
//        SecondLargest sl = new SecondLargest();
//        System.out.println(sl.secondLarge(numbers));

//        DiscountCalculator disCalc = new DiscountCalculator();
//        disCalc.setCartTotal(200);
//        disCalc.setCustomerType("PREMIUM");
//        System.out.println(disCalc.calculateDiscount());

        //2-D Array

//        int nums[][] = new int[4][3];
//
//        for(int i=0;i<4;i++){
//            for(int j=0;j<3;j++){
//                nums[i][j] = (int)(Math.random()*10);
//            }
//        }
//
//        for(int n[] : nums){
//            for(int m : n){
//                System.out.print(m);
//            }
//            System.out.println();
//        }

        Animal myDog = new Dog();
        Dog myDog1 = (Dog) myDog; //DownCasting
        myDog.sound();
        myDog1.eat();

    }
}
