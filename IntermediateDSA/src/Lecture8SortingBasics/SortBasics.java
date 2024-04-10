package Lecture8SortingBasics;


import java.util.Arrays;
import java.util.Comparator;

import static Lecture3IntroductionToArrays.Arrays.printArray;

public class SortBasics {
    public static void main(String[] args) {
        int[] arr = {1, 13, 9, 6, 12};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Integer[] arr2 = {1, 13, 9, 6, 12};

        // Sorting using a custom comparator
        Arrays.sort(arr2, Comparator.comparingInt(SortBasics::numFactors));

        System.out.println(Arrays.toString(arr2));
    }

    public static int numFactors(int number) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                if (number / i == i) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }
}
