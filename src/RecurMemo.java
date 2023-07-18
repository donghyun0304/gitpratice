import java.util.Scanner;

public class RecurMemo {
    static String[] memo;
    static int count = 0;
    static void recur(int n){

        if(memo[n+1] != null){
            System.out.println(memo[n+1]);
            ++count;
        } else{
            if(n>0) {
                recur(n - 1);
                System.out.println(n);
                recur(n - 2);
                memo[n+1] = memo[n] + n + memo[n-1];
            } else{
                memo[n+1] = "";
            }
            ++count;
            }
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        memo = new String[x+2];
        recur(x);

        System.out.println(count);

    }

}
