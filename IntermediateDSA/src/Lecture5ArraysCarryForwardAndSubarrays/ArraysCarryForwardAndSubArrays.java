package Lecture5ArraysCarryForwardAndSubarrays;

import Lecture3IntroductionToArrays.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArraysCarryForwardAndSubArrays {

    // Given a string S of lowercase letters, return the count of pairs(i,j) of indices i, j such
    // that S[i] == 'a' and S[j] == 'g' and i < k.

    public static void printAGPairs(String str) {
        int n = str.length();
        int counter = 0 ;
        char[] input = str.toCharArray();
        for (int i = 0 ; i < n - 1; i++) {
            if (input[i] == 'a') {
                for (int j = i + 1 ; j < n ; j++) {
                    if (input[j] == 'g') {
                        System.out.println("Found Pair At (" + i + " , " + j + ")");
                        counter++;
                    }
                }
            }
        }
        System.out.println("Total number of pairs are " + counter);
    }

    public static int countAGPairs(String str) {
        int n = str.length();
        int countA = 0;
        int counter = 0;
        for (int i = 0 ; i < n; i++) {
            if (str.charAt(i) == 'a') {
                countA++;
            }
            else if (str.charAt(i) == 'g') {
                counter += countA;
            }
        }
        return (counter);
    }

    public static void printAllSA(int[] A) {
        int n = A.length;
        for (int i = 0 ; i < n ; i++) {
            for (int j = i ; j < n ; j++) {
                for (int k = i ; k <= j ; k++) {
                    System.out.print(A[k]+ " ");
                }
                System.out.println();
            }
        }
    }

    public static int minMaxSubArray(int[] A) {
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

    public static int[][] solve(int[] A) {
        int n = A.length;
        List<int[]> subArrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int[] subArray = new int[j - i + 1];
                for (int k = i; k <= j; k++) {
                    subArray[k - i] = A[k];
                }
                subArrayList.add(subArray);
            }
        }

        int[][] subArrays = new int[subArrayList.size()][];
        for (int i = 0; i < subArrayList.size(); i++) {
            subArrays[i] = subArrayList.get(i);
        }

        return subArrays;
    }
    // ITC
    // JSWInfra
    // IDFCFB

    public static void print2DArray(int[][] arr) {
        for (int[] nums : arr) {
            Arrays.printArray(nums); // Move to the next line after printing all elements of a row
        }
    }


    public static void main(String[] args) {
//        printAGPairs("gcagbag");
//        System.out.println("Count of the pairs " + countAGPairs("acgdgag"));
//        System.out.println("Printing all the sub-arrays ");
//        printAllSA(new int[]{1, 2, 3, 4});
//        System.out.println(minMaxSubArray(new int[] {1, 2, 3, 4, 5, 6, 6, 5, 1}));
        int[][] subArrays = solve(new int[] {36,63,63,26,87,28,77,93,7});
        print2DArray(subArrays);
    }
}
