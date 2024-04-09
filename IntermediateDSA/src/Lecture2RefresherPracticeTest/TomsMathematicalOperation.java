package Lecture2RefresherPracticeTest;

public class TomsMathematicalOperation {
    public int solve(int[] A) {
        int sum = 0 ;
        for (int i = 1 ; i < A.length ; i += 2) {
            sum += A[i];
        }
        return sum;
    }
}
