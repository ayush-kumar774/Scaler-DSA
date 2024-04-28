package Lecture1Arrays1OneDimensional;

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

    public static int trap(int[] A) {
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
        int[] A = {0, 1, 0, 2};
        int[] B = {1, 2, 3};
        System.out.println(trap(A));
        System.out.println(trap(B));
    }
}
