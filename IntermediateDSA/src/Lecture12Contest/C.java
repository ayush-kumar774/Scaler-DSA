package Lecture12Contest;

public class C {
    public static int solve(int[] A, int B , int C) {
        int n = A.length ;

        if (B == 1) {
            for (int j : A) {
                if (j <= C) {
                    return 1;
                }
            }
        }

        int sum = 0 ;
        for (int i = 0 ; i < B ; i++) {
            sum += A[i];
        }
//        System.out.println(sum );

        if ((sum  /B) <= C) {
            return 1 ;
        }

        for (int i = 1; i <= n - B; i++) {
            sum = sum - A[i - 1] + A[i + B - 1];
            if ((sum / B) <= C){
                return 1 ;
            }
        }
        return 0 ;
    }

    public static void main(String[] args) {
//        int[] A = {30, 25, 40, 35, 20, 45, 50, 55, 22, 18, 15};
//        int B = 3;
//        int C = 30;
//
//        int[] A2 = {4, 2, 2, 5, 1};
//        int B2 = 4 ;
//        int C2 = 1 ;
        int[] A = {47, 45, 17, 25, 16, 23};
        int B = 3 ;
        int C = 28 ;

        System.out.println(solve(A, B, C));
//        System.out.println(solve(A2, B2, C2));
    }
}
