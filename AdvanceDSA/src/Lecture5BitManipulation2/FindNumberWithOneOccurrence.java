package Lecture5BitManipulation2;

public class FindNumberWithOneOccurrence {

    public static int numberWithOneOccurrenceRestAppearingTwice(int[] A) {
        int ans = 0;
        for (int i = 0 ; i < 32; i++) {
            int cnt = 0 ;
            for (int k : A) {
                if ((k & (1 << i)) > 0) { // counting the set bits
                    cnt++;
                }
            }
            if ((cnt & 1) == 1) {
//            if ((cnt % 2) != 0) {
                    ans = ans | (1 << i);
            }
        }
        return ans;
    }
    private static int numberWithOneOccurrenceRestAppearingThrice(int[] A) {
        int ans = 0;
        for (int i = 0 ; i < 32; i++) {
            int cnt = 0 ;
            for (int k : A) {
                if ((k & (1 << i)) > 0) { // counting the set bits
                    cnt++;
                }
            }
            if ((cnt % 3) != 0) {
                ans = ans | (1 << i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {2, 2, 4, 3, 5, 3, 5, 6, 6, 1, 1};
        System.out.println(numberWithOneOccurrenceRestAppearingTwice(A));
        int[] A2 = {2, 2, 2, 4, 4, 4, 9, 5, 5, 5, 7, 7, 7, 11, 11, 11};
        System.out.println(numberWithOneOccurrenceRestAppearingThrice(A2));
    }


}
/*
Every other element is occurring twice
 */