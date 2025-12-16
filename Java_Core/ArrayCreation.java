package Java_Core;

public class ArrayCreation {

    public static void main(String a[]){
//        int num [] = {1, 2, 3, 4};
//        System.out.println(num[0]);
//
//        //Dynamic array
//
//        int dynamicnum[] = new int[4];
//
//        dynamicnum[0] = 1;
//        dynamicnum[0] = 2;
//        dynamicnum[0] = 3;
//        dynamicnum[0] = 4;
//for(int i=0;i<dynamicnum.length;i++){  //Note : For arrays length is value but for string it is method 'Pravin'.length()
//    System.out.println(dynamicnum[i]);
//}

//Multi Dimensional Arrays

        int nums [][] = new int[3][4];

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                nums[i][j] = (int)(Math.random() * 100); // Math.random() returns a double and the values in 0.1 to 0.9. Hence we multiply by 100 and typecasting to int
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(nums[i][j]+ " ");
            }
            System.out.println();
        }

        //Enhanced for loop
System.out.println();
        for(int n[] : nums){
            for(int m : n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
System.out.println();

        //Jagged Array (for each row of array we can have different column size)
        int jaggedArr[][] = new int [3][];

        jaggedArr [0] = new int[2];
        jaggedArr [1] = new int[3];
        jaggedArr [2] = new int[4];

        for(int i=0;i<3;i++){
            for(int j=0;j<jaggedArr[i].length;j++){
                jaggedArr[i][j] = (int)(Math.random() * 100); // Math.random() returns a double and the values in 0.1 to 0.9. Hence we multiply by 100 and typecasting to int
            }
        }
        for(int n[] : jaggedArr){
            for(int m : n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }

    //3 D array

    int threeD[][][] = new int [3][3][3];

    //Drawbacks of Array:

    //We cannot modify size of array once we initialize it. We cannot have different datatype in single array.
    // To overcome this drawback we have collections concept in Java




}

