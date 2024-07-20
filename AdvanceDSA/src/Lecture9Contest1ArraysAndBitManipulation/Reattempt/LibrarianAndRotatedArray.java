package Lecture9Contest1ArraysAndBitManipulation.Reattempt;

public class LibrarianAndRotatedArray {
    public static int librarianAndRotatedArray(int[] A) {
        int x = 0 , y = 0 ;
        int n = A.length;

        for (int i = 0 ; i < n - 1 ; i++) {
            if (A[i] < A[i + 1]) {
                x++ ;
            }
            else {
                y++;
            }
        }

        if (y == 1) {
            if (A[n - 1] < A[0]) {
                x++ ;
            }
            else {
                y++;
            }

            if (y == 1) {
                return 1;
            }
        }
        return 0 ;
    }
    public static void main(String[] args) {
        int[] A = {2, 1, 9, 9} ;
        int[] B = {3, 4, 1, 2};
        int[] C = {3, 4, 1, 2, 6};
        System.out.println(librarianAndRotatedArray(A));
        System.out.println(librarianAndRotatedArray(B));
        System.out.println(librarianAndRotatedArray(C));
    }
}
