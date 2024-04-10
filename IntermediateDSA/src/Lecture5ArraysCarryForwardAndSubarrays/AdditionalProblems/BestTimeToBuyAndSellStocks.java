package Lecture5ArraysCarryForwardAndSubarrays.AdditionalProblems;

public class BestTimeToBuyAndSellStocks {
    public static int maxProfit(int[] A) {
        if (A.length < 2) return 0;
        int n = A.length;
        int max = A[1] - A[0];
        int min = A[0] ;
        for (int i = 0 ; i < n ; i++ ) {
            if (A[i] < min) {
                min = A[i];
            }
            max = Math.max(max, A[i] - min);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] A = {1, 4, 5, 2, 4};
        System.out.println(maxProfit(A));
    }
}
