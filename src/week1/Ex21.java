package week1;
import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a year:");
        double year = Double.parseDouble(reader.nextLine());

        if (year % 4 == 0 ) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}