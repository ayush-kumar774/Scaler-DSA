package Lecture4BitManipulation1.Assignment;

public class SetBit {
    public static int solve(int A, int B){
        if (A == B) {
            return (1 << A);
        }
        else {
            return ((1 << A) + (1 << B));
        }
    }
    public static void main(String[] args) {
        int a = 3 ;
        int b = 5 ;
        int a1 = 4;
        int b1 = 4;
        System.out.println(solve(a, b));
        System.out.println(solve(a1, b1));
    }
}
