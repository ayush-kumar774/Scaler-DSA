package Lecture6Functions.Assignment;

public class AreaOfCircle {
    public double solve(int A) {
        double ans = ( Math.PI * A * A);
        ans = Math.round(ans * Math.pow(10, 2)) / Math.pow(10, 2);
        return (ans) ;
    }

    public static void main(String[] args) {

    }
}
