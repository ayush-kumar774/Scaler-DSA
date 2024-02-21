package Lecture11HashMap.Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountUniqueElements {
    public static int solve(ArrayList<Integer> A) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int ans = 0 ;
        for (Integer element : A) {
            if (frequencyMap.containsKey(element)) {
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else {
                frequencyMap.put(element, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                ans++;
            }
        }
        System.out.println(frequencyMap.size());
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(3);
        A.add(4);
        A.add(3);
        A.add(6);
        A.add(6);

        System.out.println(solve(A));
    }
}
