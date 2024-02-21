package Lecture11HashMap.AdditionalProblems;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

public class FrequencyOfElementQuery {

    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (Integer a : A) {
            frequencyMap.put(a, frequencyMap.getOrDefault(a, 0) + 1);
        }

        for (Integer x : B) {
            ans.add(frequencyMap.getOrDefault(x , 0));
        }

        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(java.util.Arrays.asList(2, 5, 9, 2, 8));
        ArrayList<Integer> B = new ArrayList<>(java.util.Arrays.asList(3, 2));

        ArrayList<Integer> result = solve(A, B);
        System.out.println(result);
    }
}
