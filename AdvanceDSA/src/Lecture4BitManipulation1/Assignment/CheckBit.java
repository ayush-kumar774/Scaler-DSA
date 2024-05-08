package Lecture4BitManipulation1.Assignment;

public class CheckBit {
    public static int checkBit(int A, int B) {
        return ( ( A & (1 << B) ) > 0 ? 1 : 0);
    }
    public static void main(String[] args) {
        int A = 4;
        int B = 1;
        int A1 = 5;
        int B1 = 2;
        System.out.println(checkBit(A, B));
        System.out.println(checkBit(A1, B1));
    }
}
