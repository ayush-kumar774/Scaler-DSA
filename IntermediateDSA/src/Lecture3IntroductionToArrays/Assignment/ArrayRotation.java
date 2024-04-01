package Lecture3IntroductionToArrays.Assignment;

public class ArrayRotation {
    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static int[] solve(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverseArray(arr, 0, n - 1);

        reverseArray(arr, 0, k - 1);

        reverseArray(arr, k, n - 1);

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4} ;
        int k = 2 ;
        int[] ans = solve(arr, k);
        for (int a : ans) {
            System.out.print(a + " ");
        }
    }
}
