package week2;

import java.util.Scanner;

public class Ex32 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int number = 1;

        System.out.print("Until what? ");
        int read = Integer.parseInt(reader.nextLine());

        while (number <= read) {
            sum = sum + number;
            number++;
        }

        System.out.println("Sum is " + sum);

    }
}
