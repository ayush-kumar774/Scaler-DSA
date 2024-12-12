package Lecture18Searching1BinarySearch.AdditionalProblems;

public class MatrixSearch {
    public static void main(String[] args) {
        int [][] A = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };
        int B = 3;
        System.out.println(searchMatrix(A, B));
    }
    public static int searchMatrix(int[][] A, int B) {
        int n = A.length;
        int m = A[0].length;

        int low = 0 ;
        int high = n * m - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2 ;
            int row = mid / m ;
            int col = mid % m ;

            if (A[row][col] == B) {
                return 1;
            }
            else if (A[row][col] < B) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return 0;
    }
}
