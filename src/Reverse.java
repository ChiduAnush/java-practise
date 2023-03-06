public class Reverse {
    public static void main(String[] args) {

        System.out.println("to print given number in reverse");


        int n = 12345;
        int ans = 0;

        while(n>0){
            int a = n % 10;
            ans = (ans*10) + a;
            n = n/10;
        }

        System.out.println(ans);
    }
}
