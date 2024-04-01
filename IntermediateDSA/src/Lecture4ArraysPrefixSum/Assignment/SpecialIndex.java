package Lecture4ArraysPrefixSum.Assignment;

public class SpecialIndex {
    public static int findSpecialIndex(int[] A) {
        int counter = 0;
        int n = A.length;
        long totalEvenSum = 0;
        long totalOddSum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) totalEvenSum += A[i];
            else totalOddSum += A[i];
        }

        long evenSum = 0;
        long oddSum = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                if (evenSum + (totalOddSum - oddSum) == oddSum + (totalEvenSum - evenSum - A[i])) {
                    counter++;
                }
                evenSum += A[i];
            } else {
                if (evenSum + (totalOddSum - oddSum - A[i]) == oddSum + (totalEvenSum - evenSum)) {
                    counter++;
                }
                oddSum += A[i];
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int [] A = {2, 1, 6, 4};
        System.out.println(findSpecialIndex(A));
    }
}
