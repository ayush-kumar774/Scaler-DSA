package Lecture2Array2TwoDimensional;

public class ConsecutiveNumberOfOnes {
    public static int numberOfOnes(int[][] A) {
        int n = A.length;
        int i = 0 , j = n - 1;
        int ans = -1 ;
        while (i < n && j >= 0) {
            if (A[i][j] == 1) {
                ans = i ;
                j--;
            }
            else {
                i++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] A = {
                {0, 0, 1, 1},
                {0, 0, 0, 1},
                {0, 1, 1, 1},
                {1, 1, 1, 1}
        };
        System.out.println(numberOfOnes(A));
    }
}

