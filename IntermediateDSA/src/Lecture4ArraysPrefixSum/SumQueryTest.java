package Lecture4ArraysPrefixSum;

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
