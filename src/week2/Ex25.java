package week2;
import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the first number: ");
        int sum = Integer.parseInt(reader.nextLine());

        System.out.print("Type the second number: ");
        sum = sum + Integer.parseInt(reader.nextLine());

        System.out.print("Type the third number: ");
        sum = sum + Integer.parseInt(reader.nextLine());

        System.out.println("Sum: " + sum);
    }
}
