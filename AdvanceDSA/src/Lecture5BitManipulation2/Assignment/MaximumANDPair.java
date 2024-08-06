package Lecture5BitManipulation2.Assignment;

public class MaximumANDPair {
    public static void main(String[] args) {
        int[] A1 = {53, 39, 88};
        int[] A2 = {38, 44, 84, 12};
        System.out.println(maximumANDPair(A1));
        System.out.println(maximumANDPair(A2));
    }

    private static int maximumANDPair (int[] A) {
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
        return ans;
    }
}
