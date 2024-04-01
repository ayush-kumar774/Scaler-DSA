package Lecture3IntroductionToArrays.AdditionalProblems;

public class LinearSearch {
    public static int solve(int[] A, int B) {
        int counter = 0 ;
        for (int j : A) {
            if (B == j) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 5, 4};
        int B = 4;
        System.out.println(solve(arr, B));
    }
}
