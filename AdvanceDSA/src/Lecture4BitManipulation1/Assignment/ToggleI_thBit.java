package Lecture4BitManipulation1.Assignment;

public class ToggleI_thBit {
    public static int toggleBit(int A, int B) {
        return (A ^ (1 << B));
    }

    public static void main(String[] args) {
        int A1 = 4 ;
        int B1 = 1 ;
        int A2 = 5 ;
        int B2 = 2 ;
        System.out.println(toggleBit(A1, B1));
        System.out.println(toggleBit(A2, B2));
    }
}
