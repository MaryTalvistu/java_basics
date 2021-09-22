package week1;
import java.util.Scanner;


public class Ex22 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
int guess = 0;
        while (guess <= 3) {
            System.out.println("Wrong!");
            System.out.print("Enter the password: ");
            String command = reader.nextLine();
            if (command.equals("jryy qbar")) {
                System.out.println("Right!");
                break;

            }
            guess++;

        }
        System.out.println("The secret is: jryy qbar!");

    }
}
