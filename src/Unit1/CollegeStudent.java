package Unit1;

public class CollegeStudent extends Abstract {
    public CollegeStudent(String name, int roll_no) {
        super(name, roll_no);
    }

    public void attend_class() {
        System.out.println(this.name + "Attend class on Smart Board.");
    }

    public void give_exam() {
        System.out.println(this.roll_no + "Give exam in online Mode.");
    }
}