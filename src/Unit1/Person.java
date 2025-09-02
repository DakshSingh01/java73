package Unit1;

public class Person {
    public String address;

    public Person(String address) {
        this.address = address;
    }

    public void setAddress() {
        System.out.println("Address is" + this.address);
    }
}
