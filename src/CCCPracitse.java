import java.util.Arrays;

public class CCCPracitse {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {2, 7, 3, 5, 8, 4};

//        int[] brr = new int[6];
//
//        int k = 0;
//        int l = 1;
//
//        for(int i : arr){
//            if(i%2==0){
//                brr[k] = i;
//                k = k+2;
//            }else{
//                brr[l] = i;
//                l = l+2;
//            }
//        }
//
//        System.out.println(Arrays.toString(brr));

        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        int d = arr[3];
        int e = arr[4];
        int f = arr[5];

        int k = 0;
        int l = 1;

        if(a%2==0){
            arr[k] = a;
            k = k+2;
        }else{
            arr[l] = a;
            l = l+2;
        }

        if(b%2==0){
            arr[k] = b;
            k = k+2;
        }else{
            arr[l] = b;
            l = l+2;
        }
        if(c%2==0){
            arr[k] = c;
            k = k+2;
        }else{
            arr[l] = c;
            l = l+2;
        }
        if(d%2==0){
            arr[k] = d;
            k = k+2;
        }else{
            arr[l] = d;
            l = l+2;
        }
        if(e%2==0){
            arr[k] = e;
            k = k+2;
        }else{
            arr[l] = e;
            l = l+2;
        }
        if(f%2==0){
            arr[k] = f;
            k = k+2;
        }else{
            arr[l] = f;
            l = l+2;
        }

        System.out.println(Arrays.toString(arr));

    }
}
