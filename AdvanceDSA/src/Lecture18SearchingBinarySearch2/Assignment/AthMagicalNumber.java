package Lecture18SearchingBinarySearch2.Assignment;

public class AthMagicalNumber {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        int A1 = 1;
        int B1 = 2;
        int C1 = 3;
        int A2 = 4;
        int B2 = 2;
        int C2 = 3;

        int A3 = 807414236;
        int B3 = 3788;
        int C3 = 38141;
        System.out.println(solve(A1, B1, C1));
        System.out.println(solve(A2, B2, C2));
        System.out.println(solve(A3, B3, C3));
    }

    private static long gcd(long A, long B) {
        if (B == 0) return A;
        return gcd(B, A % B);
    }

    private static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    private static long magicalNumber(long mid, long b, long c) {
        return (mid / b) + (mid / c) - (mid / lcm(b, c));
    }

    private static int solve(int A, int B, int C) {
        long start = 1;
        long end = (long) A * Math.min(B, C);
        long ans = 0;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long count = magicalNumber(mid, B, C);

            if (count < A) {
                start = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }
        return (int) (ans % MOD);
    }
}
