package equality.com.pkg;

import java.util.Objects;

class Teacher {
    int teacherId;
    String teaccherName;

    public Teacher(int teacherId, String teaccherName) {
        this.teacherId = teacherId;
        this.teaccherName = teaccherName;
    }
}

class Student {
    int studentId;
    String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Student s2 = (Student) obj;
        return (this.studentId == s2.studentId && this.studentName == s2.studentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, studentName);

//        int res = 11;
//        res = res * 17 + studentId;
//        res = res * 17 + studentName.hashCode();
//        return res;

    }
}

public class Main_2 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "andy");
        Student s2 = new Student(1, "andy");
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2)); false by default

        System.out.println(s1.equals(s2)); // becausse overriden equals method...

        Teacher t1 = new Teacher(1, "andy");
        System.out.println(s1.equals(t1));

        t1 = null;

        System.out.println(s1.equals(t1));
        System.out.println("hsCode: " + (s1.hashCode() == s2.hashCode()));

        System.out.println(s1.getClass().getName());

        System.out.println(s1 instanceof  Student);
        System.out.println(s1 instanceof Object);

    }
}
