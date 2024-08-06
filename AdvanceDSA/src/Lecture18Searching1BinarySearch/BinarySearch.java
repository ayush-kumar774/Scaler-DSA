package Lecture18Searching1BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int [] A = {2005, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014,
        2015, 2016, 2017, 2018, 2019, 2020, 2021, 2022, 2023, 2024};
        int targetA = 2007;

        int[] B = {2005, 2005, 2013, 2018, 2018, 2019, 2019, 2020, 2020, 2020, 2020, 2020,
        2020, 2021, 2022, 2023, 2023, 2024, 2024};
        int targetB = 2020;
        System.out.println(binarySearch(A, targetA));
        System.out.println(binarySearch(B, targetB));

        int[] A1 = {1, 2, 3};
        int[] A2 = {10, 2, 3};
        int[] A3 = {1, 2, 3, 10, 9, 7, 6};
        int[] A4 = {5};

        System.out.println(onePeakElement(A1));
        System.out.println(onePeakElement(A2));
        System.out.println(onePeakElement(A3));
        System.out.println(onePeakElement(A4));
    }
    private static int binarySearch(int[] A, int target) {
        int start = 0 ;
        int end = A.length - 1 ;
        int ans = -1 ;

        while (start <= end) {
            int mid = start + (end - start) / 2 ;
            if (A[mid] == target) {
                ans = mid;
                end = mid - 1;
            }
            else if (A[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return ans;
    }

    private static int onePeakElement (int[] A) {
    int n = A.length;

    if (n == 1) return A[0];
    if (n == 2) return Math.max(A[0], A[1]);

    if (A[0] >= A[1]) return A[0];
    if (A[n - 1] >= A[n - 2]) return A[n - 1];

    int start = 1;
    int end = n - 2;

    while (start <= end) {
        int mid = start + (end - start) / 2;

        if (A[mid] > A[mid - 1] && A[mid] > A[mid + 1]) {
            return A[mid];
        } else if (A[mid] > A[mid - 1] && A[mid] < A[mid + 1]) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }

    return -1;
    }

    private static int localMinima (int[] A) {
        int n = A.length;
        if (A.length == 1) {
            return A[0];
        }
        if (A[0] > A[1]) {
            return A[0];
        }
        if (A[n - 1] > A[n - 2] ) {
            return A[n - 1];
        }

        int l = 1 ;
        int h = n - 2;

        while (l <= h) {
            int m = l + (h - l) / 2 ;

            if (A[m] < A[m - 1] && A[m] < A[m + 1]) {
                return A[m];
            }
            else if (A[m] < A[m - 1] && A[m] > A[m + 1] ) {
                l = m + 1;
            }
            else {
                h = m - 1;
            }
        }
        return -1;
    }
}
