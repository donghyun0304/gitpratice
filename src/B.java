public class B {

    public static void main(String[] args) {
        System.out.println(factorial(3));

    }

    static int factorial(int n){
        if(n>1){
            return n*factorial(n-1);
        } else {
            return 1;
        }
    }
}
