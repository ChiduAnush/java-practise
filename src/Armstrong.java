import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("input the number you wanna check: ");
        int n = input.nextInt();

        System.out.println(isArmstrong(n)); //to check if inputed number is armstrong or not.


        //to print all armstrong numbers between 100 and 1000
        System.out.println("all armstrong numbers between 100 to 1000 are: ");
        for(int i = 100; i <= 1000; i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }




    }

    static boolean isArmstrong(int n){

        int original = n;  //this is necessary, to check the sum with n at the end(line23), as we are changing n again and again.

        int sum = 0;

        while(n > 0){
            int rem = n % 10;
            sum += rem*rem*rem;
            n = n /10;
        }
        return sum == original;

    }


}
