package Unit1;

abstract class Abstract {
    String name;
    int roll_no;

    public Abstract(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    abstract void attend_class();

    abstract void give_exam();
}
