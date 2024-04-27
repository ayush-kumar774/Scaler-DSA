package Lecture3IntroductionToArrays;

public class Arrays {
    public static void rotateRightKTimes(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverseArray(arr, 0, n - 1);
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, n - 1);
        printArray(arr);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public  static void print2DArrays(int[][] arr) {
        for (int i = 0 ; i < arr.length ; i++) {
            for (int j = 0 ; j < arr[i].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void func(int[] arr) {
        arr[3] = 98;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        func(arr);
        System.out.println(arr[3]);

        System.out.println("Original array:");
        printArray(arr);

        System.out.println("\n\nPrinting rotated array:");
        rotateRightKTimes(arr, 2);
        System.out.println();
        printArray(arr);
    }

}
/*
Find the Space Complexity [Big(O)] of the below program.
func(int N) { // 4 bytes
    int arr[10]; // 40 Bytes
    int x; // 4 bytes
    int y; // 4 bytes
    long z; // 8 bytes
    int[] arr = new int[N]; // 4 * N bytes
}
A -> N (Correct Answer)
B -> 4N + 60
C -> Constant
D -> N^2

Find the Space Complexity [Big(O)] of the below program.
func(int N) { // 4 bytes
    int x = N; // 4 bytes
    int y = x * x; // 4 bytes
    long z = x + y; // 8 bytes
    int[] arr = new int[N]; // 4 * N bytes
    long[][] l = new long[N][N]; // 8 * N * N bytes
}
A -> N
B -> 4N + 60
C -> Constant
D -> N^2 (Correct Answer)

 */