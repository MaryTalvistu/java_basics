package week2;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double sum = 0;
        int num = 0;
        int even = 0;
        int odd = 0;
        double average = 0;
        System.out.print("Type numbers: ");

        while (true) {
            double read = Double.parseDouble(reader.nextLine());

            if (read == -1) {
                System.out.println("Thank you and see you later!");
                break;
            }
            if (read % 2 == 0){
                even++;
            } else {
                odd++;
            }

            sum = sum + read;
            num++;
            average = sum / num;
        }

        System.out.println("The sum is: " + sum);
        System.out.println("How many numbers: " + num);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }

}
