import java.util.Scanner;

public class Hanoi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        move(n,1,3);
    }

    static void move(int no, int x, int y){
        if(no>1){
            move(no-1, x, 6-x-y);
        }

        System.out.println("원반 " + no + "을 " + x + "번 기둥에서 " + y + "번 기둥으로 옮김");

        if(no>1){
            move(no-1, 6-x-y, y);
        }
    }


}
