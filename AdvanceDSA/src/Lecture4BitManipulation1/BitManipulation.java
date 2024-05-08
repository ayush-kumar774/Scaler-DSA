package Lecture4BitManipulation1;

public class BitManipulation {
    public static void binaryToDecimal(String s) {
        long ans = 0 ;
        int n = s.length();
        for (int i = n - 1 ; i >= 0 ; i--) {
            if (s.charAt(i) == '1'){
//                ans += (long) Math.pow(2, (n - i -1));
                ans += (long) (s.charAt(i) - '0') << (n - i - 1);
            }
        }
        System.out.println(ans);
    }

    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal /= 2;
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        String str ; // "110110
        str = "110110";
        System.out.println(str);
        binaryToDecimal(str);

//        int A = 2 ;
//        int B = 3 ;
//        int C = 6 ;
//        System.out.println(A & (B & C));
//        System.out.println((A & B) & C);
//        System.out.println((A & C) & B);
//        System.out.println(A | (B | C));
//        System.out.println((A | B) | C);
//        System.out.println((A | C) | B);
//        System.out.println(A ^ (B ^ C));
//        System.out.println((A ^ B) ^ C);
//        System.out.println((A ^ C) ^ B);
    }
}
