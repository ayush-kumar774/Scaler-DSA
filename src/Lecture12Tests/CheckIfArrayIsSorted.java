package Lecture12Tests;

public class CheckIfArrayIsSorted {
    public static int solve (int[] A) {
        int ans = 1 ;
        for (int i = 0 ; i < (A.length - 1) ; i++) {
            if (A[i] > A[i + 1]) {
                ans = 0 ;
                break ;
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 2, 3, 3}));
    }
}
