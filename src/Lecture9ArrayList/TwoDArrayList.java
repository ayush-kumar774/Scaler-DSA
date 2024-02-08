package Lecture9ArrayList;

import java.util.ArrayList;

public class TwoDArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list2D = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list2D.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(0);
        list2D.add(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        list2D.add(list3);

        System.out.println(list2D);
        System.out.println(list2D.get(2).get(2));
        System.out.println(list2D.get(0).size());
        System.out.println(list2D.size());
        System.out.println(list2D.get(2).remove(1));
        System.out.println(list2D);
        System.out.println(list2D.get(1).set(0, 7));
        System.out.println(list2D.get(1).add(8));
        System.out.println(list2D.get(1).add(9));
        System.out.println(list2D);
    }
}
