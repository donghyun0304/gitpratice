public class Student implements Comparable<Student>{

    int age;
    int classNumber;

    public Student(int age, int classNumber) {
        this.age = age;
        this.classNumber = classNumber;
    }

    @Override
    public int compareTo(Student o) {
        return this.classNumber - o.classNumber;
    }
}
