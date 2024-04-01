package Lecture4ArraysPrefixSum;

// In Range Always Think to use prefix sum

// Given an array representing profit or loss from a stock over
// a period of days, write a function that calculates the total profit or
// loss for a given range of days.
public class SumQueryTest {
    public static void main(String[] args) {
        // Test case 1
        int[] A1 = {1, 2, 3, 4, 5};
        int[][] Q1 = {
                {0, 2}, // Query from index 0 to 2
                {1, 3}, // Query from index 1 to 3
                {2, 4}  // Query from index 2 to 4
        };

        System.out.println("Test Case 1:");
        printQuerySum(A1, Q1);
        // Expected output:
        // 6 (1+2+3)
        // 9 (2+3+4)
        // 12 (3+4+5)

        // Test case 2
        int[] A2 = {-1, 3, 5, -2, 8, 0};
        int[][] Q2 = {
                {1, 4}, // Query from index 1 to 4
                {0, 5}  // Query from index 0 to 5
        };

        System.out.println("Test Case 2:");
        printQuerySum(A2, Q2);
        // Expected output:
        // 14 (3+5-2+8)
        // 13 (-1+3+5-2+8+0)

        int[] A3 = {-5, 10, 20, 40, 50, -10, 80, -90, -20, -10};
        int[][] Q3 = {
                {0, 9},
                {1, 4},
                {0, 0},
                {7, 9},
                {2, 7}
        };
        System.out.println("Test Case 3:");
        long[] ans = returnQuerySum(A3, Q3);
        for (long a : ans) {
            System.out.println(a);
        }
        // 65
        //120
        //-5
        //-120
        //90

        int[] A4 = {2, 3, 1, 6, 4, 5};
        int[][] Q4 = {
                {1, 3},
                {2, 5},
                {0, 4},
                {3, 3}
        };
        printEvenIndexSum(A4, Q4);
    }

    private static void printQuerySum(int[] A, int[][] Q) {
        for (int[] query : Q) {
            int s = query[0];
            int e = query[1];
            int sum = 0;
            for (int j = s; j <= e; j++) {
                sum += A[j];
            }
            System.out.println(sum);
        }
    }

    private static long[] cumulativeSumEvenIndex(int[] array) {
        long[] cumulativeSum = new long[array.length];
        cumulativeSum[0] = array[0];
        for (int i = 1 ; i < array.length; i++) {
            if (i % 2 == 0) {
                cumulativeSum[i] = cumulativeSum[i - 1] + array[i];
            }
            else {
                cumulativeSum[i] = cumulativeSum[i - 1];
            }
        }
        return cumulativeSum;
    }

    private static long[] cumulativeSumOddIndex(int[] array) {
        long[] cumulativeSum = new long[array.length];
        cumulativeSum[0] = 0;
        for (int i = 1 ; i < array.length; i++) {
            if (i % 2 == 1) {
                cumulativeSum[i] = cumulativeSum[i - 1] + array[i];
            }
            else {
                cumulativeSum[i] = cumulativeSum[i - 1];
            }
        }
        return cumulativeSum;
    }

    private static void printEvenIndexSum(int[] array, int[][]queries) {
        if (array == null || array.length == 0) {
            System.out.println("Array is null");
            return;
        }
        long [] cumulativeSum = cumulativeSumEvenIndex(array);

        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            if (start == 0) {
                System.out.println(cumulativeSum[end]);
            }
            else {
                System.out.println(cumulativeSum[end] - cumulativeSum[start - 1]);
            }
        }
    }

    private static void printQueries(int[][] queries, long[] cumulativeSum) {
         for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            if (start == 0) {
                System.out.println(cumulativeSum[end]);
            }
            else {
                System.out.println(cumulativeSum[end] - cumulativeSum[start - 1]);
            }
        }
    }
    private static void printOddIndexSum(int[] array, int[][]queries) {
        if (array == null || array.length == 0) {
            System.out.println("Array is null");
            return;
        }
        long [] cumulativeSum = cumulativeSumOddIndex(array);
        printQueries(queries, cumulativeSum);
    }

    private static long[] returnQuerySum(int[] array, int[][] queries) {
        // Check for edge cases: if the input array is null or empty, return an empty long array
        if (array == null || array.length == 0) {
            return new long[0];
        }

        // Calculate cumulative sums to enable fast sum queries
        long[] cumulativeSum = new long[array.length];
        cumulativeSum[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            cumulativeSum[i] = cumulativeSum[i - 1] + array[i];
        }

        // Prepare an array to store the answers for each query
        long[] sumsForQueries = new long[queries.length];

        // Process each query using the cumulative sums
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            // If the query starts at the beginning of the array, no need to subtract
            if (start == 0) {
                sumsForQueries[i] = cumulativeSum[end];
            } else {
                sumsForQueries[i] = cumulativeSum[end] - cumulativeSum[start - 1];
            }
        }

        // Return the array of sums for each query
        return sumsForQueries;
    }

}
