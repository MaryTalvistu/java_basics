package week9.Ex18.logic;

import java.util.ArrayList;
import java.util.List;
import week9.Ex18.domain.Box;
import week9.Ex18.domain.Thing;

public class Packer {
    private final int packerVol;
    private final List<Box> boxes;

    public Packer(int boxesVolume) {
        this.packerVol = boxesVolume;
        this.boxes = new ArrayList<Box>();
    }

    public List<Box> packThings(List<Thing> things) {
        Box box = new Box(this.packerVol);
        for (Thing t : things) {
            box.addThing(t);
            boxes.add(box);
        }
        return this.boxes;
    }
}
