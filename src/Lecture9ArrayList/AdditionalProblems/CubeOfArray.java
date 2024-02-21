package Lecture9ArrayList.AdditionalProblems;

import java.util.ArrayList;

public class CubeOfArray {
    public ArrayList<Long> solve(ArrayList<Integer> A) {
            ArrayList<Long> ans = new ArrayList<>();
            for (Integer i : A) {
                long cube = (long) i * i * i;
                ans.add(cube);
            }
            return ans;
    }
    public static void main(String[] args) {

    }
}
//A : [ 596854, 888599, 841236, 800876, 66173, 267460, 123647, 519502, 797927, 471326, 495186, 683245,
// 398056, 827037, 220154, 98419, 511555, 29725, 936711, 876364, 408745, 453790, 636945, 799309, 804424,
// 2209, 729634, 467023, 279268, 756590, 840776, 239875, 619870, 991189, 107193, 945216, 332850, 32076,
// 23407, 26682, 681099, 567713, 9653, 984770, 924041, 399722, 719831, 227121, 442622, 761112, 30452,
