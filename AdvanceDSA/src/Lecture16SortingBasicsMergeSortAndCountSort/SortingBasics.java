package Lecture16SortingBasicsMergeSortAndCountSort;

import java.util.ArrayList;
import java.util.Arrays;

public class SortingBasics {
    public static void main(String[] args) {
        int[] A = {1, 3, 4, 2, 3};
        int[] res = findSmallestNumber(A);
        System.out.println(Arrays.toString(res));

        int[] ANeg = {-3, 2, 2, 1, -4, 5, -3};
        countSortNegativeNumber(ANeg);
        countSortNegativeNumber(A);

        int[] A2 = {1, 3, 1};
        int[] A3 = {4, 2, 1, 3};

        res = solve(A2);
        System.out.println(Arrays.toString(res));
        res = solve(A3);
        System.out.println(Arrays.toString(res));

    }
    public static int[] findSmallestNumber(int[] A) {
        int[] frequency = new int[10];

        for (int a : A) {
            frequency[a] = frequency[a] + 1;
        }

        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < frequency[i]; j++) {
                answer.add(i);
            }
        }

        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }

        return result;
    }

    public static void countSortNegativeNumber(int[] A) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int a : A) {
            if (a < min) {
                min = a;
            }
            if (a > max) {
                max = a ;
            }
        }

        int [] freq = new int[max - min + 1] ;

        for (int val : A) {
            freq[(val - (min))]++;
        }
//        System.out.println(Arrays.toString(freq));

        System.out.println("Printing the array ");
        for (int i = min; i <= max; i++) {
            int cnt = freq[i - min];
            for (int j = 1 ; j <= cnt; j++) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    private static int[] solve(int[] A) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int k : A) {
            if (min > k) {
                min = k;
            }
            if (max < k) {
                max = k;
            }
        }
        int[] freq = new int [max - min + 1];
        for (int a : A) {
            freq[(a - min)]++;
        }
        ArrayList<Integer>ans = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            int cnt = freq[i - min];
            for (int j = 1 ; j <= cnt; j++) {
                ans.add(i);
            }
        }

        int[] res = new int[ans.size()];
        for (int i = 0 ; i < ans.size() ; i++) {
            res[i] = ans.get(i);
        }
        return res;
    }
}
