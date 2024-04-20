package Lecture12Contest;

public class A {
    public static String toggleCase(String A) {
        char[] s = A.toCharArray();
        for (int i = 0 ; i < A.length() ; i++) {
            if (s[i] >= 'A' && s[i] <= 'Z') {
                s[i] = (char) (s[i] + ('a' - 'A'));
            }
            else if (s[i] >= 'a' && s[i] <= 'z') {
                s[i] = (char) (s[i] - ('a' - 'A'));
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0 ; i < A.length() ; i++) {
            ans.append(s[i]);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String str1 = "hEllo";
        String str2 = "dOMs";
        System.out.println(toggleCase(str1));
        System.out.println(toggleCase(str2));
    }
}
