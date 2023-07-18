import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Student2 a = new Student2(17,2);
        Student2 b = new Student2(18,1);
        Student2 c = new Student2(15,3);

        int isBig = comp.compare(b,c);

        if(isBig>0) System.out.println("b가 c보다 큽니다");
        else if(isBig==0) System.out.println("두 객체의 크기가 같습니다");
        else System.out.println("b가 c보다 작습니다");
    }
    public static Comparator<Student2> comp = new Comparator<Student2>() {
        @Override
        public int compare(Student2 o1, Student2 o2) {
            return o1.classNumber - o2.classNumber;
        }
    };

    public static Comparator<Student2> comp2 = new Comparator<Student2>() {
        @Override
        public int compare(Student2 o1, Student2 o2) {
            return o1.age - o2.age;
        }
    };
}
