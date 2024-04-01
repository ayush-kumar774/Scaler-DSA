package Lecture3IntroductionToArrays.Assignment;

//import java.util.Scanner;

public class GoodPair {
    public static int solve(int[] A, int B) {
        int n = A.length;
        for (int i = 0 ; i < n - 1; i++) {
            for (int j = i + 1 ; j < n ; j++) {
                if (A[i] + A[j] == B) {
                    return 1 ;
                }
            }
        }
        return 0 ;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int[] A = new int[] {1, 2, 3, 4};
//        int B = sc.nextInt();
        System.out.println(solve(A, 7));
    }
}
