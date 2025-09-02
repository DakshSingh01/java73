package Unit1;

public class variable {
    static int bread = 10;

    public static void display() {
        System.out.println("Slices Remaining " + bread);
    }

    public static void eat() {
        --bread;
    }

    public static void main(String[] args) {
        display();
        eat();
        display();
        System.out.println(bread);
    }

    static {
        System.out.println("I am in static block.");
    }
}