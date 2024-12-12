package Lecture18Searching1BinarySearch.Assignment;

public class SortedInsertPosition {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[] {1, 3, 5, 6}, 5));
        System.out.println(searchInsert(new int[] {1, 4, 9}, 10));
    }
    public static int searchInsert(int[] A, int target) {
        int ans = 0 ;
        int left = 0 ;
        int right = A.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (A[mid] == target) {
                ans = mid;
                right = mid - 1;
            }
            else if (A[mid] < target) {
                ans = mid + 1;
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
