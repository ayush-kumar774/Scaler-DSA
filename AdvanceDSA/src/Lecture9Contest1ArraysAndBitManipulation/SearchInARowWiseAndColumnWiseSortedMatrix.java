package Lecture9Contest1ArraysAndBitManipulation;

public class SearchInARowWiseAndColumnWiseSortedMatrix {
    public static int solve(int[][] A, int B) {
        int n = A.length;
        int m = A[0].length;
        int i = 0, j = m - 1 ;
        int ans = -1 ;
        while (i < n && j >= 0) {
            if (A[i][j] == B) {
                int end = 0 ;
                for (int k = j ; k >= 0 ; k--) {
                    if (A[i][k] == B) {
                        end = k ;
                    }
                }
                ans = ( ( (i + 1) * 1009 ) + (end + 1) );
                return (ans);
            }
            else if(A[i][j] < B) {
                i++;
            }
            else {
                j--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
