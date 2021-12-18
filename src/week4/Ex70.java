package week4;
import java.util.ArrayList;

public class Ex70 {
    public static void combine(ArrayList<Integer> first, ArrayList<Integer> second) {

        first.add(4);
        first.add(3);

        second.add(5);
        second.add(10);
        second.add(7);


        first.addAll(second);

        System.out.println(first);

        System.out.println(second);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        combine(list1, list2);
    }

}

