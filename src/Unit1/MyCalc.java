package Unit1;

public class MyCalc {
    public static void main(String[] args) {
        Calculator cl = new Calculator();
        cl.Area(12.3, (double)5.0F);
        cl.Area((double)6.0F);
        cl.Area((double)5.0F, (double)4.0F, (double)2.0F);
    }
}