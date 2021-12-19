package week8;
import java.util.ArrayList;


public class Ex11 {
        public static void main(String[] args) {
            Box box = new Box(5);
            Box bb2 = new Box(1);

            box.add(new Book("Fedor Dostojevski", "Crime and Punishment", 2));

            bb2.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
            bb2.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
            bb2.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

            box.add(bb2);

            System.out.println(box);
        }

    public static class CD implements ToBeStored {

        private final String artist, title;
        private final int year;
        private final double weight; //in kg

        public CD(String artist, String title, int year){
            this.artist = artist;
            this.title = title;
            this.year = year;
            this.weight = 0.1;
        }

        @Override
        public double weight() {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return this.weight;
        }

        @Override
        public String toString(){
            return this.artist + ": " + this.title + " (" + this.year + ")";
        }
    }

    public static class Book implements ToBeStored {

        private final String writer, name;
        private final double weight;

        public Book(String writer, String name, double weight) {
            this.writer = writer;
            this.name = name;
            this.weight = weight;
        }

        @Override
        public double weight() {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return this.weight;
        }

        @Override
        public String toString(){
            return this.writer + ": " + this.name;
        }

    }

    public static class Box implements ToBeStored {

        private final double maxWeight; //in kgs
        private final ArrayList<ToBeStored> boxes;

        public Box(double maxWeight) {
            this.boxes = new ArrayList<ToBeStored>();
            this.maxWeight = maxWeight;
        }

        @Override
        public double weight() {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

            double weight = 0.0;

            for (ToBeStored toStore : this.boxes) {
                weight += toStore.weight();
                //return this.maxWeight;
            }
            return weight;
        }

        public void add(ToBeStored toAdd) {

            double boxWeight = toAdd.weight();

            if (boxWeight + this.weight() <= this.maxWeight) {
                this.boxes.add(toAdd);
            }
        }

        @Override
        public String toString() {

            int count = this.boxes.size();
            double weight = this.weight();

            return "Box: " + count + " things," + " total weight " + weight + " kg";

        }
    }

    public static interface ToBeStored {
        double weight();
    }
}
