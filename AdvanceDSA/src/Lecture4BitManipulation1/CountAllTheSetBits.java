package Lecture4BitManipulation1;

public class CountAllTheSetBits {
    public static int countSetBits(int N) {
        int counter = 0 ;
        while (N > 0) {
            if ((N & 1) == 1) {
                counter++;
            }
            N = N >> 1;
        }
        return counter;
    }
    public static void main(String[] args) {
        int N = 54;
        System.out.println(countSetBits(N));
    }
}
