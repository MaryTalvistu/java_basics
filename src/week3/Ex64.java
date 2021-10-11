package week3;

import java.util.ArrayList;

public class Ex64 {
    public static double average(ArrayList<Integer> list) {
        float sum = 0;

        for(int num:list){
            sum += num;
        }

        float average = (sum / list.size());
        return average;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}

