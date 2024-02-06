package Lecture6Functions.Assignment;

public class FavouriteChocolate {
    public static int solve (int A, int B, int C) {
        int ans = (A / B) ;
        return Math.min(C, ans);
    }
    public static void main(String[] args) {

    }
}
