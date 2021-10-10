package week2;

import java.util.Scanner;

public class Ex30 {

    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
        int number = 1;

        System.out.print("Up to what number: ");
        int read = Integer.parseInt(reader.nextLine());

        while (number <= read) {
                System.out.println(number);
            number++;
        }
    }
}