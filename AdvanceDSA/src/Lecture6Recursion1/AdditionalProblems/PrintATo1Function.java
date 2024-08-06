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
/*
Problem Description
You are given an integer A, print A to 1 using using recursion.

Note :- After printing all the numbers from A to 1, print a new line.



Problem Constraints
1 <= A <= 104



Input Format
First argument A is an integer.



Output Format
Print A space-separated integers A to 1.
Note: There should be exactly one space after each integer. Print a new line after printing the A integers



Example Input
Input 1:

10
Input 2:

5


Example Output
Output 1:

10 9 8 7 6 5 4 3 2 1
Output 2:

5 4 3 2 1


Example Explanation
Explanation 1:

Print 10 to 1 space separated integers.
Explanation 2:

Print 5 to 1 space separated integers.
 */