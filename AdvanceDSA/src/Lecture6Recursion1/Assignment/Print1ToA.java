package Lecture6Recursion1.Assignment;

public class Print1ToA {
    public static void printNum(int current, int end) {
        if (current > end) {
            System.out.println();
            return;
        }
        System.out.print(current + " ");
        printNum(current + 1, end);
    }

    public static void solve(int A) {
        printNum(1, A);
    }


    public static void main(String[] args) {
        solve(10);
    }
}
