package Contest2;

import java.util.Arrays;

public class DecreasingOrderWords {
    public static void main(String[] args) {
        String[] str = {"hi", "he", "hello"};
        System.out.println(Arrays.toString(sortDecreasing(str)));
    }

    public static String[] sortDecreasing(String[] str) {
        Arrays.sort(str, (a, b) -> Integer.compare(b.length(), a.length()));
        return str;
    }
}
