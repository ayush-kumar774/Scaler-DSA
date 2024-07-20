package Lecture14HashingBasics.AdditionalProblems;

import java.util.HashMap;

public class CountUniqueElements {
    public static void main(String[] args) {
        int[] A = {3, 3, 3, 9, 0, 1, 0};
        int[] B = {3, 4, 3, 6, 6};

        System.out.println(solve(A));
        System.out.println(solve(B));
    }

    private static int solve (int[] A) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int a : A) {
            hashMap.put(a, hashMap.getOrDefault(a, 0) + 1);
        }
        int counter = 0 ;
        for (int values : hashMap.values()) {
            if (values == 1) counter++;
        }
        return counter;
    }
}
