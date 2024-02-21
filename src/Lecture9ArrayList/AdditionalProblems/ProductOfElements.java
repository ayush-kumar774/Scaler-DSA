package Lecture9ArrayList.AdditionalProblems;

import java.util.ArrayList;
import java.util.Collections;

public class ProductOfElements {
    public static long solve (ArrayList<Integer> arr) {
        long ans = 1L;
        for (Integer x : arr) {
            ans *= x;
        }
        return ans ;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Integer[] array = {7, 9, 2, 51};

        Collections.addAll(arrayList, array);
        System.out.println(solve(arrayList));
    }
}
