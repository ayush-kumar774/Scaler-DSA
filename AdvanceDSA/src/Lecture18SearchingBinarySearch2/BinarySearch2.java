package Lecture18SearchingBinarySearch2;

public class BinarySearch2 {
    public static void main(String[] args) {
        System.out.println("Sqrt of 49 = " + sqrt(49));
        System.out.println("Sqrt of 50 = " + sqrt(50));
        System.out.println("Sqrt of 40 = " + sqrt(40));

        int[] A = {8, 9, 1, 1, 2, 3, 4, 5, 6, 7};
        int k = 1;
        System.out.println("Searched for " + k + " in sorted and rotated array = " + searchInRotateAndSortedArray(A, k));

        int a = 3;
        int b = 15;
        int c = 7;

        System.out.println(a + "th magic number = " +magicNumber(a, b, c));
    }

    public static int sqrt(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int start = 1;
        int end = n ;
        int ans = -1 ;

        while (start <= end) {
            int mid = start + (end - start) / 2 ;
            int sqrtMid = mid * mid;
            if(sqrtMid == n) {
                ans = mid;
                return ans;
            }
            else if (sqrtMid < n) {
                ans = mid;
                start = mid + 1 ;
            }
            else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static int searchInRotateAndSortedArray(int[] A, int k) {
        int start = 0 ;
        int end = A.length - 1 ;

        while (start <= end) {
            int mid = start + (end - start) / 2 ;
            if (A[mid] == k) {
                return mid;
            }
            else if (A[start] <= A[mid]) { // start to mid sorted
                if (A[start] <= k && k < A[mid]) {
                    end = mid - 1;
                }
                else start = mid + 1;
            }
            else { // mid to end sorted
                if (A[mid] < k && k <= A[end]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }


        return -1;
    }

    private static int gcd (int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private static int lcm (int a , int b) {
        return (a * b) / gcd(a, b);
    }

    private static int countMagical (int mid, int b, int c) {
        return ((mid / b) + (mid / c) - (mid / lcm(b, c)));
    }

    private static int magicNumber(int a, int b, int c) {
        int start = 1 ;
        int end = (Math.min(b, c)) * a;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int count = countMagical(mid, b, c);
            if(count < a) {
                start = mid + 1;
            }
            else  {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans ;
    }
}
