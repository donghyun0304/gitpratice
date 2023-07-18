import java.util.Comparator;

public class Student2 implements Comparator<Student2> {

    int age;
    int classNumber;

    public Student2(int age, int classNumber) {
        this.age = age;
        this.classNumber = classNumber;
    }

    @Override
    public int compare(Student2 o1, Student2 o2) {
        return o1.classNumber-o2.classNumber;
    }
}
