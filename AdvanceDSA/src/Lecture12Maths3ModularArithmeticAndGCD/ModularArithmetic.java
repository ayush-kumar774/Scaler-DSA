package Lecture12Maths3ModularArithmeticAndGCD;

public class ModularArithmetic {

    public static void module() {
        // (a + b) % m = (a % m + b % m) % m --> Prevent overflow
        // (a * b) % m = (a % m * b % m) % m --> Prevent overflow
        // (a + m) % m = (a % m)
        // (a % m) = (a + m) % m
        // (a - b) % m = (a % m - b % m + m ) % m
        // (a ^ b) % m = ( (a % m) ^ b ) % m
    }
    /*
    Count the pairs whose sum is multiple of m where (arr[i] + arr[j]) % m = 0
     */
    public static int countPairsWithModuleZero(int[] arr, int m) {
        int counter = 0 ;
        int pair;
        int[] frequencyMap = new int[m];
        for (int j : arr) {
            int rem = j % m;
            if (rem == 0) {
                pair = 0;
            } else {
                pair = m - rem;
            }

            counter = counter + frequencyMap[pair];
            frequencyMap[rem]++;
        }
        return counter;
    }

    public static int gcd (int a, int b) {
        if (b == 0) return a ;
        return gcd(b , a % b);
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 3, 8, 12};
        int m = 6;
        System.out.println(countPairsWithModuleZero(arr, m));
        System.out.println(gcd(3, 5));
    }
}
