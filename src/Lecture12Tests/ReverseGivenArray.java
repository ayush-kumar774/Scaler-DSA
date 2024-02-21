package Lecture12Tests;

public class ReverseGivenArray {

    public static  int[] solve (int[] A){
        int n = A.length;
        for (int i = 0 ; i < (n / 2) ; i++) {
            int temp = A[i];
            A[i] = A[n - 1 - i];
            A[n - 1 - i] = temp;
        }
        return A;
    }
    public static void main(String[] args) {
        int[] A = {3, 5, 3, 2, 9, 3, 10, 10, 10, 3};
        A = solve(A);

        // Print the reversed array
        for (int value : A) {
            System.out.print(value + " ");
        }
    }
}
