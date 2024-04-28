package Lecture1Arrays1OneDimensional.Assignment;

public class RainWaterTrapped {
    public static int[] lMax(int[] A) {
        int[] lMax = new int[A.length];
        lMax[0] = A[0];
        int max = lMax[0] ;
        for (int i = 1 ; i < A.length ; i++) {
            max = Math.max(max, A[i]);
            lMax[i] = max;
        }
        return lMax;
    }

    public static int[] rMax(int[] A) {
        int[] rMax = new int[A.length];
        rMax[A.length - 1] = A[A.length - 1];
        int max = rMax[A.length - 1] ;
        for (int i = A.length - 2 ; i >= 0 ; i--) {
            max = Math.max(max, A[i]);
            rMax[i] = max;
        }
        return rMax;
    }

    public static int trap(final int[] A) {
        int[] lMax = lMax(A);
        int[] rMax = rMax(A);

        int maxWater = 0 ;

        for (int i = 1 ; i < A.length - 1 ; i++) {
            int left = lMax[i - 1] ;
            int right = rMax[i + 1] ;
            int contribution = Math.min(left, right) - A[i] ;
            if (contribution > 0) {
                maxWater += contribution ;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        int[] A = {0, 1, 0, 2} ;
        int[] B = {1, 2} ;
        System.out.println(trap(A));
        System.out.println(trap(B));
    }
}
/*
Problem Description
Given a vector A of non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.



Problem Constraints
1 <= |A| <= 100000



Input Format
First and only argument is the vector A



Output Format
Return one integer, the answer to the question



Example Input
Input 1:

A = [0, 1, 0, 2]
Input 2:

A = [1, 2]


Example Output
Output 1:

1
Output 2:

0


Example Explanation
Explanation 1:

1 unit is trapped on top of the 3rd element.
Explanation 2:

No water is trapped.
 */