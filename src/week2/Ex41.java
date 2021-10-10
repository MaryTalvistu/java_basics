package week2;

import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        int drawNumber;
        int answer;
        int times = 1;

        drawNumber = (int) (Math.random()*100)+1;

        Scanner reader = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a number: ");
            answer = Integer.parseInt(reader.nextLine());
            System.out.println("Your guess number is: " + answer);

            if(answer == drawNumber) {
                break;
        }
            if(answer < drawNumber) {
                System.out.println("The number is lesser, guess made " + times);
            } else {
                System.out.println("The number is larger, guess made " + times);
            }
            times++;
        }
        System.out.println("Congratulations! Secret number is: " + drawNumber);
    }
}
