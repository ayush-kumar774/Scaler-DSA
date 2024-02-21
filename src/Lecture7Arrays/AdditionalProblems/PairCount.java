package Lecture7Arrays.AdditionalProblems;

public class PairCount {
    public static int solve(int[] A , int B) {
        int counter = 0 ;
        for (int i = 0 ; i < (A.length - 1) ; i++) {
            for (int j = (i + 1) ; j < (A.length) ; j++) {
                if (A[i] + A[j] == B) {
                    counter++;
                }
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,1, 1}, 2 ));
    }
}
