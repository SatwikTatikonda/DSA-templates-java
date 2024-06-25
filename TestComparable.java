import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    int age;
    int marks;

    Student(int age,int marks) {
        this.age = age;
        this.marks = marks;

    }

    public int compareTo(Student that) {
        if (this.marks < that.marks) {
            return -1;
        } else {
            return 1;
        }
    }
}

public class TestComparable {

    public static void main(String[] args) {
        Student s1 = new Student(20,88);
        Student s2 = new Student(26,90);
        Student s3 = new Student(22,97);
        ArrayList<Student> al = new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        Collections.sort(al);
        for (Student s : al) {
            System.out.println(s.age);
        }

    }
}
