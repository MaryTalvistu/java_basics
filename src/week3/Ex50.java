package week3;

import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();

        if (name.length() <= 3) {
            System.out.println("");
        } else {

            System.out.println("1. character: " + name.charAt(0));
            System.out.println("2. character: " + name.charAt(1));
            System.out.println("3. character: " + name.charAt(2));
        }
        System.out.println("Type your name: " + name);
    }
}
