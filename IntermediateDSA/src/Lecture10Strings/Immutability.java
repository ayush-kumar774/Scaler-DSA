package Lecture10Strings;

public class Immutability {
    public static void main(String[] args) {
        String s = "Hello";
        String s1 = "Hello";
        String s2 = s1;
        String s4 = s + "Bye";
        s = s.concat("Bye");
        System.out.println(s);
    }
}
