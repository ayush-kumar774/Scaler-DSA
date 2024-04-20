package Lecture12Contest;

public class SubarraySum {
    public static void printSubarraySums(int[] arr, int B) {
        int n = arr.length;
        if (n < B) {
            System.out.println("Invalid input: Size of array is smaller than B.");
            return;
        }

        int sum = 0;
        // Compute sum of first window of size B
        for (int i = 0; i < B; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of subarray [0, " + (B - 1) + "]: " + sum);

        // Compute sum of remaining windows using sliding window
        for (int i = 1; i <= n - B; i++) {
            sum = sum - arr[i - 1] + arr[i + B - 1];
            System.out.println("Sum of subarray [" + i + ", " + (i + B - 1) + "]: " + sum);
        }
    }

    public static void main(String[] args) {
        int A[] = {47, 45, 17, 25, 16, 23};
        int B = 3;
        printSubarraySums(A, B);
    }
}
