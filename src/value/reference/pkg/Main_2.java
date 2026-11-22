package value.reference.pkg;

// pass by value object

class Student {
    int x;
    int y;

    public Student(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main_2 {

    public static void main(String[] args) {

        Student s1 = new Student(10, 20);

        System.out.println(s1.x);
        System.out.println(s1.y);

        changeValues(s1);

        System.out.println(s1.x);
        System.out.println(s1.y);



    }

    private static void changeValues(Student s) {
        s.x = s.x + 10;
        s.y = s.y + 10;

    }

}
