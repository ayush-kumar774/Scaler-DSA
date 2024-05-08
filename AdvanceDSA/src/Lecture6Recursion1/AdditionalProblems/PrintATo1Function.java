package Lecture6Recursion1.AdditionalProblems;

public class PrintATo1Function {
    public static void solve(int A) {
        if (A == 0) {
            System.out.println();
            return ;
        }
        System.out.print(A + " ");
        solve(A - 1);
    }

    public static void main(String[] args) {
        int n1 = 10 ;
//        int n2 = 5 ;
        solve(n1);
//        solve(n2);
        int ans = fun(2, 10);
        System.out.println(ans);
    }

    public static int fun(int x, int n) {
        if (n == 0) {
            return  1 ;
        }
        else if (n % 2 == 0) {
            return fun(x * x , n / 2 );
        }
        else {
            return x * fun(x * x, (n - 1) / 2) ;
        }
    }

}
