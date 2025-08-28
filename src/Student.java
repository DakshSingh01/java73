public class Student {
    int roll_no;
    String name;

    Student() {
        System.out.print("I am a const.");
    }

    Student(int r, String n) {
        this.roll_no = r;
        this.name = n;
    }

    Student(Student s) {
        this.roll_no = s.roll_no;
        this.name = s.name;
    }

    public void display() {
        System.out.println("Roll No " + this.roll_no);
        System.out.println("Name is " + this.name);
    }
}