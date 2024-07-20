package Lecture13OOPS.Assignment;

import java.util.Arrays;

public class FactorCounter {

    // Method to count factors for each number up to maxValue
    private static int[] countFactors(int maxValue) {
        // Initialize an array to store the number of factors for each number
        int[] factorCounts = new int[maxValue + 1];

        // Iterate through each integer and update its multiples
        for (int i = 1; i <= maxValue; i++) {
            for (int j = i; j <= maxValue; j += i) {
                factorCounts[j]++;
            }
        }

        return factorCounts;
    }

    public static void main(String[] args) {
        int maxValue = 20; // Example maximum value
        int[] factorCounts = countFactors(maxValue);

        // Print the number of factors for each number up to maxValue
        for (int i = 1; i <= maxValue; i++) {
            System.out.println("Number of factors of " + i + " is " + factorCounts[i]);
        }
    }
}
