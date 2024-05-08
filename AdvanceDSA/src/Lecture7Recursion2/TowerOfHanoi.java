package Lecture7Recursion2;

public class TowerOfHanoi {
    // Steps = (2^N) - 1

    // 1. Move N-1 disks from start --> temp.
    // 2. Move Nth disk from start --> destination.
    // 3. Move N-1 disk from temp --> start
    // if (N == 1) return 1; // Base condition


    public static void towerOfHanoi(int N , String source, String dest, String inter) {
        if (N == 0) {
            return;
        }
        towerOfHanoi(N - 1 , source, inter, dest);
        System.out.println("Moving " + N + "th disk from " + source + " to " + dest);
//        towerOfHanoi(1, source, dest, inter);
        towerOfHanoi(N- 1, inter, dest, source);
    }

    public static void main(String[] args) {
        towerOfHanoi(2, "A" , "B", "C");
    }
}
