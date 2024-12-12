package Lecture18Searching1BinarySearch.Assignment;

public class SingleElementInSortedArray {
    public static void main(String[] args) {

    }
    public static int solve(int[] A) {
        int left = 0;
        int right = A.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (mid % 2 != 0) {
                mid--;
            }

            if (A[mid] == A[mid + 1]) {
                left = mid + 2;
            } else {
                right = mid;
            }
        }

        return A[left];
    }
}
