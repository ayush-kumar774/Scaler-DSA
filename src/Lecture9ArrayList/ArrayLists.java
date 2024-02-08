package Lecture9ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    // Given an arraylist as an input return an arraylist of the multiples
    // input are greater than equal to 0

    public static ArrayList<Integer> multipleOf5Or7 (ArrayList<Integer> list) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0 ; i < list.size(); i++) {
            if (list.get(i) % 5 == 0 || list.get(i) % 7 == 0) {
                ans.add(list.get(i));
            }
        }
        return ans;
    }

    // Given two integers A and B as input, return ArrayList containing first B multiples of A.
    public static ArrayList<Integer> printMultiples(int a , int b) {
        ArrayList<Integer> table = new ArrayList<>();
        for (int i = 1 ; i <= b ; i++) {
            table.add(a * i);
        }
        return table;
    }

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>(); // It does not support a primitive data type.
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.remove(0);
//        for(int a : list) {
//            System.out.println(a);
//        }
//        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
//        ArrayList<Integer> list = new ArrayList<>();
////        for (int i = 0 ; i < n ; i++) {
////            int a = sc.nextInt();
////            list.add(a);
////        }
//        while (sc.hasNextInt()) {
//            list.add(sc.nextInt());
//        }
//        System.out.println(list);
//        ArrayList<Integer> ans = multipleOf5Or7(list);

        ArrayList<Integer> ans = printMultiples(2, 4);
        System.out.println(ans);
    }
}
