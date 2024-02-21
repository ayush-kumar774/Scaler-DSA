package Lecture11HashMap.AdditionalProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ContriesWithPopulationLessThanK {
    public static int population(HashMap<String, Integer> H, int K) {
        int counter = 0;
        for (Map.Entry<String, Integer> entry : H.entrySet()) {
            if (entry.getValue() < K) {
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Adding elements to the HashMap
        map.put("India", 12);
        map.put("Pakistan", 8);
        map.put("China", 9);

        System.out.println(population(map, 10));

    }
}
