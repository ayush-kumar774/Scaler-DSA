package Lecture20BinarySearchOnAnswer.Assignment;

public class PaintersPartitionProblem {
    public static void main(String[] args) {
        int A1 = 2, B1 = 5, A2 = 10, B2 = 1, A3 = 4, B3 = 10, A4 = 1, B4 = 1000000;
        int[] C1 = {1, 10};
        int[] C2 = {1, 8, 11, 3};
        int[] C3 = {884, 228, 442, 889};
        int[] C4 = {1000000, 1000000};

        System.out.println(paint(A1, B1, C1));
        System.out.println(paint(A2, B2, C2));
        System.out.println(paint(A3, B3, C3));
        System.out.println(paint(A4, B4, C4)); // Should correctly return 9400003
    }

    public static int paint(int A, int B, int[] C) {
        int mod = 10000003;
        int low = 0;
        int high = 0;

        for (int i : C) {
            low = Math.max(low, i);
            high += i;
        }

        // Do NOT apply modulo to `low` and `high`.
        low *= B;
        high *= B;

        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPaintPossible(A, B, mid, C)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans % mod; // Apply modulo only to the final answer
    }

    private static boolean isPaintPossible(int painters, int timePerUnit, int maxTime, int[] boards) {
        int totalPainters = 1;
        long timeTaken = 0;

        for (int board : boards) {
            long boardTime = (long) board * timePerUnit; // Do NOT apply modulo here
            if (boardTime > maxTime) {
                return false;
            }
            timeTaken += boardTime;

            if (timeTaken > maxTime) {
                totalPainters++;
                timeTaken = boardTime;

                if (totalPainters > painters) {
                    return false;
                }
            }
        }
        return true;
    }
}
