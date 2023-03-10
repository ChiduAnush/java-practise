import java.util.Arrays;

public class SwappingInArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("before swapping:");
        System.out.println(Arrays.toString(arr));

        swap(arr, 1, 2);

        System.out.println("after swapping");
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int arr[], int index1, int index2){
        int temp;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
