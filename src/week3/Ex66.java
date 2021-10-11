package week3;

import java.util.ArrayList;
import java.util.Collections;

public class Ex66 {
    public static int greatest(ArrayList<Integer> list) {
        int greatestNumber = Collections.max(list);
        return greatestNumber;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + greatest(list));
    }
}
