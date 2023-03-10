import java.util.Arrays;

public class ReversingArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("before swapping:");
        System.out.println(Arrays.toString(arr));

        reversearray(arr);

        System.out.println("after swapping:");
        System.out.println(Arrays.toString(arr));



    }

    static void reversearray(int[] arr){  //this is known as the 2 pointer method
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1, int index2){
        int temp;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
