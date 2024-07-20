package Lecture14HashingBasics.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CommonElement {
    public static void main(String[] args) {
        int[] A = {1, 2, 2, 1};
        int[] B = {2, 3, 1, 2};

        int[] res = solve(A, B);
        System.out.println(Arrays.toString(res));
    }

    private static int[] solve(int[] A, int[] B) {
        HashMap<Integer, Integer> hashMap1 = new HashMap<>();
        HashMap<Integer, Integer> hashMap2 = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();

        for (int a : A) {
            hashMap1.put(a, hashMap1.getOrDefault(a, 0) + 1);
        }

        for (int b : B) {
            hashMap2.put(b, hashMap2.getOrDefault(b, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : hashMap1.entrySet()) {
            int key = entry.getKey();

            if (hashMap2.containsKey(key)) {
                int min = Math.min(hashMap1.get(key), hashMap2.get(key));
                for (int i = 0; i < min; i++) {
                    res.add(key);
                }
            }
        }

        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }

        return result;
    }
}
