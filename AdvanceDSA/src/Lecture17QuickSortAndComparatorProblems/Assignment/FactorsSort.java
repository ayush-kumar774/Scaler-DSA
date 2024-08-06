package Lecture17QuickSortAndComparatorProblems.Assignment;

import java.util.Arrays;
import java.util.Comparator;

public class FactorsSort {
    private static int countFactors(int n) {
        int counter = 0 ;
        for (int i = 1 ; i * i <= n; i++) {
            if (n % i == 0) {
                counter++;

                if (i != n / i) {
                    counter++;
                }
            }
        }
        return counter;
    }

    private static class FactorComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b) {
            int factorCountA = countFactors(a);
            int factorCountB = countFactors(b);

            if (factorCountA != factorCountB) {
                return factorCountA - factorCountB;
            }
            else {
                return a - b;
            }
        }
    }

    public static int[] solve(int[] A) {
        Integer[] array = Arrays.stream(A).boxed().toArray(Integer[]::new);

        Arrays.sort(array, new FactorComparator());

        for (int i = 0 ; i < A.length; i++) {
            A[i] = array[i];
        }

        return A;
    }

    public static void main(String[] args) {
        int[] A = {6, 8, 9};
        System.out.println(Arrays.toString(solve(A)));
        A = new int[]{2, 4, 7};
        System.out.println(Arrays.toString(solve(A)));
    }
}
