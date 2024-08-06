package Lecture18SearchingBinarySearch2.Assignment;

public class SquareRootOfInteger {
    public static void main(String[] args) {
        int a = 11, b = 9 ;
        System.out.println(sqrt(a));
        System.out.println(sqrt(b));
    }
    private static int sqrt(int A) {
        int start = 1 ;
        int end = A;
        int ans = 0 ;
        while (start <= end) {
            int mid = start + (end - start) / 2 ;
            if (mid <= A / mid) {
                ans = mid ;
                start = mid + 1 ;
            }
            else {
                end = mid - 1 ;
            }
        }
        return ans;
    }
}
