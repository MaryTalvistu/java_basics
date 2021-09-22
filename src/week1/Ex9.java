package week1;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        double a = Double.parseDouble(reader.nextLine());
        System.out.print("Type another number: ");
        double b = Double.parseDouble(reader.nextLine());
        double result = a / b;

        System.out.println("Division of your numbers is: " + result);
    }
}
