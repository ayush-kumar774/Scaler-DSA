package Lecture9ArrayList.AdditionalProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplesOfEachElement {
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        for (Integer num : B) {
            ArrayList<Integer> mul =  new ArrayList<>();
            for (Integer x : A) {
                if (x % num == 0) {
                    mul.add(x);
                }
            }
            res.add(mul);
        }
        return res;
    }
    public static void main(String[] args) {
        Integer[] A = {2, 5, 9, 3, 8};
        Integer[] B = {3, 2};

        // Convert arrays to ArrayLists
        ArrayList<Integer> listA = new ArrayList<>(Arrays.asList(A));
        ArrayList<Integer> listB = new ArrayList<>(Arrays.asList(B));

//        ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<>();
//        listOfLists.add(listA);
//        listOfLists.add(listB);

        System.out.println(solve(listA, listB));
    }
}
