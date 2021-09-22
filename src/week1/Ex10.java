package week1;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the radius: ");
        double radius = Double.parseDouble(reader.nextLine());

        double circumference = 2 * Math.PI * radius;

        System.out.println("Circumference of the circle: " + circumference);
    }
}
