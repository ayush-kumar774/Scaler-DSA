package Lecture11InterviewProblems.AdditionalProblems;

public class NBy3Number {
    public static int repeatedNumbers (int[] A) {
        int n = A.length;
        int count1 = 0 , count2 = 0 ;
        int candidate1 = 0 , candidate2 = 1 ;

        for (int num : A) {
            if (num == candidate1) {
                count1++;
            }
            else if (num == candidate2) {
                count2++;
            }
            else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            }
            else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0 ;
        for (int num : A) {
            if (num == candidate1) {
                count1++;
            }
            else if (num == candidate2){
                count2++;
            }
        }
        if (count1 > (n / 3) ) {
            return candidate1;
        }
        else if (count2 > (n / 3)) {
            return candidate2 ;
        }
        else {
            return -1;
        }
    }
//    public static int validate(int[] A) {
//        int candidate = repeatedNumbers(A) ;
//        System.out.println("Candidate " + candidate);
//        int n = A.length;
//        int counter = 0 ;
//        for (int j : A) {
//            if (j == candidate) {
//                counter++;
//            }
//        }
//        if (counter > (n/3)) {
//            return candidate;
//        }
//        else {
//            return -1 ;
//        }
//    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 1, 1};
        int[] B = {1, 2, 3};
        int[] C = {1, 1, 1, 2, 3, 5, 7 };
        System.out.println(repeatedNumbers(A));
        System.out.println(repeatedNumbers(B));
        System.out.println(repeatedNumbers(C));
    }
}
