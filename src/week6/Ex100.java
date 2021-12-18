package week6;
import java.util.Random;

public class Ex100 {
    public static void main(String[] args) {
        NightSky NightSky = new NightSky(8, 4);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        System.out.println("");

        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
    }

    public static class NightSky {
        private double density;
        private int width;
        private int height;
        private int starsInLastPrint;

        public NightSky(int width, int height) {
            this(0.1, width, height);
        }

        public NightSky(double density) {
            this(density, 20, 10);
        }

        public NightSky(double density, int width, int height) {
            this.density = density;
            this.width = width;
            this.height = height;
        }

        public void printLine() {
            Random random = new Random();
            for(int i = 0; i < this.width; i++) {
                double next = random.nextDouble();

                if(next <= this.density) {
                    System.out.print("*");
                    this.starsInLastPrint++;
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        public void print() {
            if(starsInLastPrint != 0)
                starsInLastPrint = 0;
            for(int i = 0; i < this.height; i++)
                printLine();
        }

        public int starsInLastPrint() {
            return this.starsInLastPrint;
        }
    }
}
