import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

//        //one dimensional array:
//        int[] arr = new int[3];
//        arr = new int[]{1, 2, 3,};
//
//        //2-dimensional array
//        int[][] arrarr = new int[3][];   //will make a 3x3 matrix(2d array)

//        array with variable columns.
//        int[][] multi = new int[3][];
//
//        multi = new int[][]{
//                {1, 2, 3},
//                {4, 5},
//                {1, 2,3 , 5,4 ,6 , 7}
//        };

//        //to take input into a 2d array: (works even it has variable length columns)
//        int[][] arr = new int[3][3];
//
//        for(int row = 0; row < arr.length; row++){    //this is for each row
//            for(int col = 0; col < arr[row].length; col++){  //this is for each column
//                arr[row][col] = input.nextInt();
//
//            }
//        }

        //1st way to print 2D array
//        for(int row = 0; row < arr.length; row++){
//            for(int col = 0; col < arr[row].length; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println(" ");
//        }

//        //2nd way to print, using enhanced for loop
//        for(int[] ar : arr){
//            for(int a : ar){
//                System.out.print(a + " ");
//            }
//            System.out.println();
//        }

//        //3rd way to print, using tostring method.  nicest way
//        for(int[] ar:arr){
//            System.out.println(Arrays.toString(ar));
//        }


        //for arrays in which column size is not fixed.
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6},
                {7, 8, 9}
        };

        for(int[] ar:arr){
            System.out.println(Arrays.toString(ar));
        }

        









    }
}
