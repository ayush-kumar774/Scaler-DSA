package Lecture14HashingBasics.Assignment;

import java.util.HashMap;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int[] A = {10, 5, 3, 4, 3, 5, 6};
        System.out.println(solve(A));
    }
    private static int solve(int[] A) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int a : A) {
            hashMap.put(a, hashMap.getOrDefault(a, 0) + 1);
        }
        for (int a : A) {
            if (hashMap.get(a) >= 2) {
                return a;
            }
        }
        return -1;
    }
}
