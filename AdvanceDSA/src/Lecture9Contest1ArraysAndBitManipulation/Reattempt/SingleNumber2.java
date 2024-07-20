package Lecture9Contest1ArraysAndBitManipulation.Reattempt;

public class SingleNumber2 {

    private static int singleNumber2(int[] A) {
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

    public static void main(String[] args) {
        int[] A = {1, 1, 1, 0, 0, 0, 2};
        System.out.println(singleNumber2(A));
    }
}
