package Lecture8SortingBasics;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] A) {
        int i , j , mi;
        for ( i = 0 ; i < A.length - 1; i++) {
            mi = i ;
            for (j = i + 1 ; j < A.length ; j++) {
                if (A[j] < A[mi]) {
                    mi = j;
                }
            }
            int temp = A[mi];
            A[mi] = A[i] ;
            A[i] = temp;
        }
    }

    public static void insertionSort(int[] A) {
        int n = A.length;
        for (int i = 1 ; i < n ; i++) {
            int curr = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > curr) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = curr;
        }
    }

    public static void main(String[] args) {
        int[] A = {2, 3, 1, 0, -9};
        selectionSort(A);
        System.out.println(Arrays.toString(A));
        insertionSort(A);
        System.out.println(Arrays.toString(A));
    }
}
