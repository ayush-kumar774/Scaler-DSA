package Lecture7Recursion2;

import java.util.ArrayList;

public class PrintAllOccurrence {
    public static ArrayList<Integer> allOccurrence(int[] A, int B) {
        return allOccurrenceHelper(A, 0, A.length - 1, B);
    }

    private static ArrayList<Integer> allOccurrenceHelper(int[] A, int start, int end, int B) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (start > end) {
            return ans;
        }
        if (A[start] == B) {
            ans.add(start);
        }
        ans.addAll(allOccurrenceHelper(A, start + 1, end, B)); // Continue searching for more occurrences
        return ans;
    }

    public static ArrayList<Integer> find(int[] A, int B, int e) {
        if (e == -1) {
            return new ArrayList<>();
        }
        ArrayList<Integer> ans = find(A, B, e - 1);
        if (A[e] == B) {
            ans.add(e);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {4, 5, 3, 1, 5, 4, 5};
        ArrayList<Integer> res = allOccurrence(A, 5);
        ArrayList<Integer> res2 = find(A, 5, A.length - 1);
        System.out.println(res);
        System.out.println(res2);
    }
}
