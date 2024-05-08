package Lecture4BitManipulation1.Assignment;

public class MinimumHelpFromAlex {
    public static int minHelp(int A) {
        int counter = 0 ;
        while (A > 0) {
            if ((A & 1) == 1) {
                counter++;
            }
            A = A >> 1;
        }
        return counter;
    }

    public static void main(String[] args) {
        int A = 3;
        int A1 = 3;
        int A2 = 4;
        int A3 = 11;
        System.out.println(minHelp(A));
        System.out.println(minHelp(A1));
        System.out.println(minHelp(A2));
        System.out.println(minHelp(A3));

    }
}
