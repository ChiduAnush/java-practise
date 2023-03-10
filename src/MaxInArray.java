public class MaxInArray {
    public static void main(String[] args) {

        int[] arr = {1, 3, 28, 9, 18};
        System.out.println(maxelement(arr));


    }

    static int maxelement(int arr[]){
        int max = 0;
//        for(int a:arr){
//            if(a>max){
//                max = a;
//            }
//        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;

    }
}
