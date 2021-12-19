package week7;
import java.util.Scanner;
import java.util.*;


public class Ex7 {

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");

        ArrayList<String> translations = dictionary.translationList();
        for (String translation : translations) {
            System.out.println(translation);
        }
    }
    public static class Dictionary {
        private HashMap<String, String> translator;

        public Dictionary() {
            this.translator = new HashMap<String, String>();
        }

        public String translate(String word) {

            String key = this.translator.get(word);

            return key;
        }

        public void add(String word, String translation) {
            this.translator.put(word, translation);
        }

        public int amountOfWords() {
            int numberOfWords = 0;

            for (String key : this.translator.keySet()) {
                numberOfWords++;
            }

            return numberOfWords;
        }

        public ArrayList<String> translationList() {
            ArrayList<String> translationList = new ArrayList<String>();

            for (String key : this.translator.keySet()) {		// iterate through all keys
                String valueString = this.translator.get(key);	// get value using current key

                String keyValue = key + " = " + valueString;	// turn key and value into one string

                translationList.add(keyValue);
            }

            return translationList;
        }
    }

    public class TextUserInterface {
        private Scanner reader;
        private Dictionary dictionary;

        public TextUserInterface(Scanner reader, Dictionary dictionary) {
            this.reader = reader;
            this.dictionary = dictionary;
        }

        public void openingScript() {
            System.out.println("Statement: ");
            System.out.println("   quit - quit the text user interface");
            System.out.println();
        }

        public void nextStatement() {
            System.out.print("Statement: ");
        }

        public void start() {
            openingScript();

            while (true) {
                nextStatement();

                String input = this.reader.nextLine();

                if (input.equals("quit")) {		//quit
                    System.out.print("Cheers!");
                    break;
                } else if (input.equals("add")) {	//add
                    this.add();
                } else if (input.equals("translate")) {	//translate
                    this.translate();
                } else {				//unknown command
                    System.out.println("Unknown statement");
                }

                System.out.println();
            }
        }

        public void add() {
            System.out.print("In Finnish: ");
            String finnish = this.reader.nextLine();

            System.out.print("Translation: ");
            String translation = this.reader.nextLine();

            this.dictionary.add(finnish, translation);
        }

        public void translate() {
            System.out.print("Give a word: ");
            String word = this.reader.nextLine();

            System.out.println("Translation: " + this.dictionary.translate(word));
        }
    }
}
