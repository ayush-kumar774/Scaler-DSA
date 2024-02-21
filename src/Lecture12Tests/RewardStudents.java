package Lecture12Tests;

public class RewardStudents {
    public static int solve(int[] A) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int maxCounter = 0 ;
        for (int i = 0 ; i < A.length ; i++) {
            max = Math.max(max, A[i]);
        }
        for (int i = 0 ; i < A.length ; i++) {
            if(max == A[i]) {
                maxCounter++;
            }
            if (max2 < A[i] && A[i] != max) {
                max2 = A[i];
            }
        }
        if (maxCounter >= 2) {
            max2 = max;
        }
//        System.out.println(max);
//        System.out.println(max2);
        return (max + max2);
    }
    public static void main(String[] args) {
        System.out.println(solve(new int[]{17, 15, 8, 18, 6, 7, 20}));
    }
}
