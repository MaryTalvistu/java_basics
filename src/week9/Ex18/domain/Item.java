package week9.Ex18.domain;

public class Item implements Thing, Comparable<Item> {

    private final String name;
    private final int volume;

    public Item(String name, int vol) {
        this.name = name;
        this.volume = vol;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.volume + " dm^3)";
    }

    @Override
    public int compareTo(Item o) {
        return this.volume - o.getVolume();
    }
}
