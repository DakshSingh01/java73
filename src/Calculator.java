public class Calculator {
    double ar;

    public void Area(double l, double b) {
        this.ar = l * b;
        System.out.println("Area of Rectangle" + this.ar);
    }

    public void Area(double r) {
        this.ar = Math.PI * r * r;
        System.out.println("Area of Circle" + this.ar);
    }

    public void Area(double l, double b, double h) {
        this.ar = (double)2.0F * (l * b + b * h + h * b);
        System.out.println("Area of " + this.ar);
    }
}