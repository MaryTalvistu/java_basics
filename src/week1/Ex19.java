package week1;
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("How old are you? ");
        double number = Double.parseDouble(reader.nextLine());

        if (number > 0 && number <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}