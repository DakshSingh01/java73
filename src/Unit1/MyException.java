package Unit1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyException {
    public static void main(String[] args) {
        int z = 0;
        Scanner sc = new Scanner(System.in);

        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            z = x / y;
            System.out.println("Exception Not Occur");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Result : " + z);
        }

    }
}