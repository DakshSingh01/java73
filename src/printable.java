public interface printable {
    void print();

    private void my() {
        System.out.println("This is my private method.");
    }

    static void myStatic() {
        System.out.println("This is my static method.");
    }
}