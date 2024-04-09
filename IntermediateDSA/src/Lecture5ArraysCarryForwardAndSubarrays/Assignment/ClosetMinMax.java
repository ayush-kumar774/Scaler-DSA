package Lecture5ArraysCarryForwardAndSubarrays.Assignment;

public class ClosetMinMax {
    public static int closetMinMaxInASubArray(int[] A) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = A.length;
        for (int j : A) {
            if (j > max) max = j;
            if (j < min) min = j;
        }
        int lastMin = -1;
        int lastMax = -1;
        int ans = Integer.MAX_VALUE ;

        for (int i = 0 ; i < n; i++) {
            if (A[i] == max) {
                lastMax = i;
                if (lastMin != -1) {
                    ans = Math.min(i - lastMin + 1, ans);
                }
            }
            if (A[i] == min) {
                lastMin = i;
                if (lastMax != -1)
                {
                    ans = Math.min(i - lastMax + 1, ans);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {2, 6, 1, 6, 9};
        System.out.println(closetMinMaxInASubArray(A));
    }
}
