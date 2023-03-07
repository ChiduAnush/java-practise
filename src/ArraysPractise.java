import java.util.Arrays;
import java.util.Scanner;


public class ArraysPractise {
    public static void main(String[] args) {

        System.out.println("lets play with arrays!");
        Scanner input = new Scanner(System.in);



        //to store 5 integers
//        int[] arr = new int[5];
//        System.out.println(arr[2]);

        //or directly:
        //int[] brr = {15, 16, 17, 18, 19, 20};

//        String[] strs = new String[5];
//        System.out.println(strs[1]);

        //to take input
//        int[] nums = new int[5];

//        for(int i = 0; i < nums.length; i++){
//            nums[i] = input.nextInt();
//        }
//
//        //to print
//        System.out.println(Arrays.toString(nums));

        String[] names = new String[5];

        for(int i = 0; i < names.length; i++){
            names[i] = input.next();
        }


        //System.out.println(Arrays.toString(names));

        //using enhanced for loop to print
        //for each loop
        for(String num : names){  //for every element in array, print element
            System.out.println(num);
        }




    }

}
