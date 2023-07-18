import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prac {

    public static void main(String[] args) {

        int[] numbers = {1,2,3};
        int[] answer = new int[numbers.length];

        String direction = "right";

        int temp;

        if(direction.equals("right")){
            temp = numbers[0];

            for(int i=0; i<numbers.length-1; i++){
                answer[i+1] = numbers[i];
            }
            answer[0] = numbers[numbers.length];
        } else{
            temp = numbers[numbers.length-1];

            for(int i=0; i<numbers.length-1; i++){
                answer[i+1] = numbers[i];
            }
            answer[0] = numbers[numbers.length];
        }

    }
}
