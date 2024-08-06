package Lecture19SortingDoubts;

import java.util.Arrays;

public class SortingAndComparator {
    public static void main(String[] args) {
        int[] A = {90, 7, 2, 10};
        System.out.println("Largest number = " + largestNumber(A));

        int[][] mat = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };

        int target = 3;
        System.out.println("Target at = " + Arrays.toString(searchMatrix(mat, target)));
    }

    /*
        Given an integer array with +ve numbers. Arrange the array such that
        it forms the largest number and return the answer as string.
     */
    public static String largestNumber(int[] A) {
        int n = A.length;
        String []str = new String[n];
        for (int i = 0 ; i < n ; i++) {
            str[i] = String.valueOf(A[i]);
        }

        Arrays.sort(str, (o1, o2) -> {
            String s1 = o1 + o2;
            String s2 = o2 + o1;

            return s2.compareTo(s1);
//            return s1.compareTo(s2);// smallest number
            // if s1 == s2 --> 0
            // if s1 < s2 --> -1
            // if s1 > s2 --> 1
        });

        if (str[0].equals("0")) {
            return "0";
        }

        StringBuilder ans = new StringBuilder();
        for (String s : str) {
            ans.append(s);
        }
        return ans.toString();
    }

    private static int[] searchMatrix(int[][]A, int B) {
        int[] ans = new int[] {-1, -1};

        int low = 0;
        int n = A[0].length;
        int high = ((A.length) * n) - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2 ;
            int row = mid / n ;
            int col = mid % n ;
            if (A[row][col] == B) {
                ans[0] = row;
                ans[1] = col;
                return ans;
            }
            else if (A[row][col] < B) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
