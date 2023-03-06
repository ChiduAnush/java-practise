import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

        System.out.println("welcome to calculator!");
        Scanner in = new Scanner(System.in);

        int ans = 0;


        while(true){
            System.out.println("input any operand.('x' if u wanna quit)");
            int op = in.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.print("input 2 numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1*num2;
                }
                if(op == '/'){
                    if(num2 != 0) {
                        ans = num1 / num2;
                    }else{
                        System.out.println("cannot divide by 0!");
                    }
                }
                if(op == '%'){
                    ans = num1 % num2;
                }

            } else if(op == 'x'){
                System.out.println("thank you, have a nice day!");
                break;
            } else {
                System.out.println("not recognised");
            }


            System.out.println(ans);
        }





    }
}
