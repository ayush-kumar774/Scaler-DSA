package Lecture9Contest1ArraysAndBitManipulation;

import java.util.HashMap;
import java.util.Map;

public class BenjaminAndAND {


    public static int[] countPairsWithBitSet(int[] A, int[] B) {
//        int[] bits = new int[32];
//
//        for (int num : A) {
//            for (int i = 0; i < 32; i++) {
//                if (((num >> i) & 1) == 1) {
//                    bits[i]++;
//                }
//            }
//        }
//        System.out.println();
//        int[] ans = new int[B.length];
//        for (int i = 0 ; i < B.length ; i++) {
//            ans[i] = ((bits[B[i]] * (bits[B[i]] - 1) ) / 2) ;
//        }
        int[] ans = new int[B.length];
        for (int i = 0 ; i < B.length ; i++) {
            int pos = B[i];
            int c = 0 ;
            for (int k : A) {
                if ((k & (1 << pos)) > 0) {
                    c++;
                }
            }
            ans[i] = (c * (c - 1)) / 2 ;
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] A = {28, 7, 3, 6, 23, 16, 5, 29, 23};
        int[] Q = {5, 0, 1};  // Queries
        int[] result = countPairsWithBitSet(A, Q);
        System.out.println("Count of pairs for each query:");
        for (int i = 0; i < result.length; i++) {
            System.out.println("Query " + Q[i] + ": " + result[i]);
        }
        int x = 21;
        x = x << 1;
        x = x >> 2;
        x = x << 1;
        System.out.println(x);

    }
}
