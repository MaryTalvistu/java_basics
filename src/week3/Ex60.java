package week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex60 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        while(true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            words.add(word);

            if (word.isEmpty()) {
                break;
            }

        }

        System.out.println("You typed the following words: " );
        Collections.sort(words);
        for (String word : words) {
            System.out.println(word);
        }
    }

}
