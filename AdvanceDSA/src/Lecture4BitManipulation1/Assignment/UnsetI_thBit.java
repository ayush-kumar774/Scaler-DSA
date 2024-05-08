package Lecture4BitManipulation1.Assignment;

public class UnsetI_thBit {
    public static int solve(int A, int B) {
        if ((A & (1 << B)) > 0) {
            return (A ^ (1 << B));
        }
        return A;
    }
    public static void main(String[] args) {
        int a = 4;
        int b = 1;
        int a1 = 5;
        int b1 = 2;
        int a2 = 7;
        int b2 = 1;
        System.out.println(solve(a, b));
        System.out.println(solve(a1, b1));
        System.out.println(solve(a2, b2));
    }
}
