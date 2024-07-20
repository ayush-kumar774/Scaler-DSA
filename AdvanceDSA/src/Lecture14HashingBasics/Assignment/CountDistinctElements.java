package Lecture14HashingBasics.Assignment;

import java.util.HashSet;

public class CountDistinctElements {
    public static void main(String[] args) {
        int[] A = {3, 3, 3, 9, 0, 1, 0} ;
        System.out.println(solve(A));
    }
    private static int solve(int[] A) {
        HashSet<Integer> hashSet = new HashSet<> () ;
        for (int a : A) {
            hashSet.add(a);
        }
        return hashSet.size();
    }
}
