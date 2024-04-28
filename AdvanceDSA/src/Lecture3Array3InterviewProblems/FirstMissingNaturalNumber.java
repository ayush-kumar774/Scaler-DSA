package Lecture3Array3InterviewProblems;

public class FirstMissingNaturalNumber {
    public static int firstMissingNaturalNumber(int[] A) {
        int n = A.length;
        boolean[] found = new boolean[n];
        for (int j : A) {
            if (!(j > n || j <= 0)) {
                found[j - 1] = true;
            }
        }
        for (int i = 0 ; i < n ; i++) {
            if (!found[i]) {
                return (i + 1);
            }
        }
        return (n + 1);
    }
    public static void main(String[] args) {
        int[] A1 = {1, 0, -5, -6, 4, 2};
        int[] A2 = {1, 2, 3, 4, 6, 5};
        System.out.println(firstMissingNaturalNumber(A1));
        System.out.println(firstMissingNaturalNumber(A2));
    }
}
