import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        int num = 29183;
        int k = 1;


        String numStr = num + "";
        String kStr = k + "";

        int answer = numStr.indexOf(kStr);

        System.out.println(answer < 0 ? -1 : answer + 1);




    }

}

