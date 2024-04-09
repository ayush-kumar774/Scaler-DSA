package Lecture5ArraysCarryForwardAndSubarrays.Assignment;

public class SpecialSubsequencesAG {
    public static int countSubsequenceAG(String str) {
        int mod = 1000000007;
        int count = 0 ;
        int countA = 0 ;
        for(int i = 0 ; i < str.length(); i++) {
            if (str.charAt(i) == 'A') {
                countA++;
            }
            else if (str.charAt(i) =='G') {
                count += ((countA) % mod);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "ABCGAG";
        System.out.println(countSubsequenceAG(str));
    }
}
