package Lecture10Strings.Assignment;

import java.util.Scanner;

public class LengthOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0){
            String str = sc.next();
            System.out.println(str.length());
            t--;
        }

    }
}
