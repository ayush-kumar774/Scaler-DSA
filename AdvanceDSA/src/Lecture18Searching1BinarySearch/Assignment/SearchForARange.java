package Lecture18Searching1BinarySearch.Assignment;

import java.util.Arrays;

public class SearchForARange {
    public static void main(String[] args) {
        int[] A = {5, 7, 7, 8, 8, 10};
        int B = 8;
        System.out.println(Arrays.toString(searchRange(A, B)));
    }
    public static int[] searchRange(final int[] A, int B) {
        int[] result = new int[]{-1, -1};

        int left = 0;
        int right = A.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (A[mid] == B) {
                result[0] = mid;
                right = mid - 1;
            } else if (A[mid] < B) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        left = 0;
        right = A.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (A[mid] == B) {
                result[1] = mid;
                left = mid + 1;
            } else if (A[mid] < B) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
