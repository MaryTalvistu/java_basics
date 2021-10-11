package week3;

import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = reader.nextLine();
        System.out.print("Length of the first part: ");
        int length = Integer.parseInt(reader.nextLine());

        if(word.length() < length) {
            System.out.println("The word is shorter!");
        } else {
            String answer = word.substring(0, length);
            System.out.println("Result: " + answer);
        }

    }


}
