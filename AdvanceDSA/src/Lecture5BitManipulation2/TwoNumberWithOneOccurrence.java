package Lecture5BitManipulation2;

import java.util.Arrays;

public class TwoNumberWithOneOccurrence {

    public static void findSingleNumbers(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        int rightmostSetBit = xor & -xor;

        int num1 = 0, num2 = 0;
        for (int num : nums) {
            if ((num & rightmostSetBit) == 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }
        System.out.println("The two numbers appearing only once are: " + num1 + " and " + num2);
    }

    public static int[] numbersWithOneOccurrence(int[] A) {
        int[] ans = new int[2];
        int res = 0 ;
        for (int k : A) {
            res ^= k;
        }
        int pos = 0 ;
        for (pos = 0 ; pos < 32 ; pos++) {
            if ((res & (1 << pos)) > 0) { // finding the first set bit in the xor-ed result
                break;
            }
        }
        for (int num : A) {
            if ((num & (1 << pos)) > 0) {
                ans[0] ^= num; // cancelling all the number with same position set bits
            }
        }
        ans[1] = res ^ ans[0];
        Arrays.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] A = {4, 5, 4, 1, 6, 5, 2, 6};
        int[] A2 = {3, 5, 3, 6, 7, 2, 2, 6};
        int[] A3 = {2308,1447,1918,1391,2308,216,1391,410,1021,537,1825,1021,1729,669,216,1825,537,1995,805,410,805,602,1918,1447,90,1995,90,1540,1161,1540,2160,1235,1161,602,880,2160,1235,669};
        int[] res = numbersWithOneOccurrence(A);
        print(res);
        res = numbersWithOneOccurrence(A2);
        print(res);
        findSingleNumbers(A);
        findSingleNumbers(A3);
    }
    public static void print(int[] res)
    {
        for (int r : res) {
            System.out.print(r + " ");
        }
        System.out.println();
    }
}
