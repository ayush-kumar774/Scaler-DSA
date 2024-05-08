package Lecture5BitManipulation2;

public class MaxPairAfterAND {
    public static int[] max(int[] A) {
        int ans = 0 ;
        for (int i = 31; i >= 0 ; i--) {
            int count = 0 ;
            for (int k : A) {
                if ((k & (1 << i)) > 0) {
                    count++;
                }
            }
            if (count >= 2) {
                ans |= (1 << i);
                for (int j = 0 ; j < A.length ; j++) {
                    if ((A[j] & (1 << i)) <= 0) {
                        A[j] = 0;
                    }
                }
            }
        }
        int count = 0 ;
        for (int a : A) {
            if (a > 0) {
                count++ ;
            }
        }
        return new int[] {ans, ((count * (count - 1 ) )/ 2)};
        // non zero elements are the resultant pair
    }
    public static void main(String[] args) {
        int[] A = {5, 6, 3, 8, 5, 5, 5, 5};
        int[]res = max(A);
        System.out.println("Max AND Value " + res[0]);
        System.out.println("Number of pairs " + res[1]);
//        System.out.println(max(A));
        System.out.println(1 ^ 2 ^ 3 ^ 4 ^ 5);
        System.out.println(1^5);
    }
}
// Calculate the count of pairs for which '&' is maximum.
// {5, 6, 3, 8, 5, 5, 5, 5}
// Answer - 10.