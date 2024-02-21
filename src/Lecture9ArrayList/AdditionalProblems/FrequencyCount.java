package Lecture9ArrayList.AdditionalProblems;

import java.util.ArrayList;

public class FrequencyCount {
    public static int frequency(ArrayList<Integer> A, int x) {
        int counter = 0 ;
        for (Integer a : A) {
            if (a.equals(x)) {
                counter++;
            }
        }
        return counter;
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> B = new ArrayList<>();
        for (Integer a : A) {
            B.add(frequency(A, a));
        }
        return B;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(2);
        A.add(3);
        A.add(3);
        A.add(4);

        // Call the solve function to get the frequencies
        ArrayList<Integer> frequencies = solve(A);

        // Print the frequencies
        System.out.println("Frequencies:");
        for(int frequency : frequencies) {
            System.out.print(frequency + " ");
        }
    }
}
