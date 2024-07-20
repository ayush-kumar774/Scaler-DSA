package Lecture14HashingBasics.Assignment;

import java.util.Arrays;
import java.util.HashMap;

public class FrequencyOfElementQuery {
    public static void main(String[] args) {
        int[] A = {1, 2, 1, 1};
        int[] B = {1, 2};
        int[] res = solve(A, B);
        System.out.println(Arrays.toString(res));
    }
    private static int[] solve(int[] A, int[] Q) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int a : A) {
            hashMap.put(a, hashMap.getOrDefault(a, 0) + 1);

        }
        int[] frequency = new int[Q.length];
        for (int i = 0; i < Q.length; i++) {
            frequency[i] = hashMap.getOrDefault(Q[i], 0);
        }
        return frequency;
    }
}
