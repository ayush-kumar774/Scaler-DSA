package Lecture18SearchingBinarySearch2.Assignment;

public class RotatedSortedArraySearch {
    public static void main(String[] args) {

    }

    public static int search (final int[] A, int B) {
        int low = 0, high = A.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (A[mid] == B) {
                return mid;
            }

            if (A[low] <= A[mid]) {
                if (A[low] <= B && B < A[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            else {
                if (A[mid] < B && B <= A[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}
