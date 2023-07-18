import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class A {

    public static void main(String[] args) {

        int n = 15;
        int answer = 0;
        for(int i=3; i<=n; i++){
            for(int j=2; j<i; j++) {
                if (i % j == 0) {
                    answer++;
                    break;
                }
            }
        }
        System.out.println(answer);
        System.out.println();
    }


}
