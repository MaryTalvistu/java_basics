package week9.Ex18.domain;
import java.util.ArrayList;
import java.util.List;

public class Box implements Thing {

    private final int maxCap;
    private List<Thing> things;

    public Box(int maximumCapacity) {
        this.maxCap = maximumCapacity;
        this.things = new ArrayList<Thing>();
    }

    public boolean addThing(Thing thing) {

        int vol1 = thing.getVolume();
        int vol2 = getVolume();
        int vol = vol1 + vol2;

        if (vol <= this.maxCap) {
            this.things.add(thing);
            return true;
        }
        return false;
    }

    //retunrs the volume of the list of things
    @Override
    public int getVolume() {
        int vol = 0;
        for (Thing t : things) {
            vol += t.getVolume();
        }
        return vol;
    }
}