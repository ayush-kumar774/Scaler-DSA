package Lecture3IntroductionToArrays.Assignment;

public class ReverseInARange {
    public static int[] solve(int[] A, int start, int end) {
        while(start < end) {
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }
        return A;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4} ;
        int B = 2 ;
        int C = 3 ;
        int[] ans = solve(arr, B, C);
        for (int a : ans) {
            System.out.print(a + " ");
        }
    }
}
