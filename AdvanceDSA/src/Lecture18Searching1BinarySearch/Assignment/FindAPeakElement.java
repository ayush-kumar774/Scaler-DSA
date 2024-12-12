package Lecture18Searching1BinarySearch.Assignment;

public class FindAPeakElement {
    public static void main(String[] args) {

    }
    public static int solve(int[] A) {
        int left = 0;
        int right = A.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (A[mid] > A[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return A[left];
    }
}
