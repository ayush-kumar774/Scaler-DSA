package Lecture1Arrays1OneDimensional;

public class BeggarsOutsideATemple {
    public static int[] finalBeggarState(int N, int Q, int[] S, int[] X) {
        int [] ans = new int[N];
        for (int i = 0 ; i < Q ; i++) {
            int s = S[i];
            int amount = X[i] ;
            for (int j = s ; j < N ; j++) {
                ans[j] += amount;
            }
        }
        return ans;
    }
    public static int[] finalBeggarOptimized(int N , int Q, int[] S, int[] X) {
        int[] ans = new int[N];
        for (int i = 0 ; i < Q ; i++) {
            int s = S[i] ;
            ans[s] += X[i];
        }

        for (int i = 1 ; i < N ; i++) {
            ans[i]  = ans[i] + ans[i - 1];
        }
        return ans;
    }
    public static int[] finalBeggerStateWithEndIndex(int N , int Q, int[] S, int[] E, int[] A) {
        return null ;
    }
    public static void main(String[] args) {
        int N = 6 ;
        int[] S = {2, 4, 0 , 0, 0};
        int[] X = {20, 10, 5, -5, 10};
        int Q = S.length;
        int[] money = finalBeggarState(N, Q, S, X);
        int[] money2 = finalBeggarOptimized(N, Q, S, X);
        for (int m  : money) {
            System.out.print(m + " ");
        }
        System.out.println();
        for (int m  : money2) {
            System.out.print(m + " ");
        }
    }
}
