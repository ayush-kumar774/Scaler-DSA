package Lecture5Pattern;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Given n as input print n "*"

        int n = sc.nextInt();
//        for (int i = 0 ; i < n ; i++) {
//            System.out.print("*");
//        }

        // Given n as input print n*n matrix
//        for (int i = 0 ; i < n ; i++) {
//            for (int j = 0 ; j < n ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Given n and m as input, print rectangle of n * m
//        int m = sc.nextInt();
//        for (int i = 0 ; i < n ; i++) {
//            for (int j = 0 ; j < m ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Given n as input, print staircase pattern
//        for (int i = 0; i < n; i++) {
//            for (int j = 0 ; j <= i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Given N as an input print below format.
        // input n = 4
        // * 2
        // * 2
        // * 2 *
        // * 2 * 4

//        for (int i = 1 ; i <= n ; i++) {
//            for (int j = 1 ; j <= i ; j++) {
//                if (j % 2 == 0) {
//                    System.out.print(j);
//                }
//                else {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }

        /*
            Given n as input, print below format
            N = 4
            * _ _ *
            * _ _ *
            * _ _ *
            * _ _ *

            N = 3
            * _ *
            * _ *
            * _ *
         */
//        int n = sc.nextInt();
//        for (int i = 1 ; i <= n ; i++) {
//            for (int j = 1 ; j <= n ; j++) {
//                if (j == 1 || j == n) {
//                    System.out.print("*");
//                }
//                else System.out.print("-");
//            }
//            System.out.println();
//        }

        /*
            Given n as input prints this pattern
            N = 5
            * * * * *
            *       *
            *       *
            *       *
            * * * * *
         */

//        for (int i = 1 ; i <= n ; i++) {
//            for (int j = 1 ; j <= n ; j++) {
//                if (i == 1 || i == n || j == 1 || j == n) {
//                    System.out.print("*");
//                } else System.out.print("-");
//            }
//            System.out.println();
//        }

        /*
            Given n as an input, print below pattern
            N = 4
            * * * *
            * * *
            * *
            *
            // row + stars = n + 1
            // stars = (N + 1) - row
         */
//        for (int i = n ; i >= 1 ; i--) {
//            for (int j = i ; j >= 1 ; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for (int row = 1 ; row <= n ; row++) {
//            for (int star = 1; star <= (n + 1 - row) ; star++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
            Given n as an input, print the following
            N = 4
            * _ _ _ *
            * _ _ *
            * _ *
            * *
            N = 3
            * _ _ *
            * _ *
            * *

            row + space = n
            space = n - row
         */
//        for (int row = 1 ; row <= n ; row++) {
//            System.out.print("*");
//            for (int col = 1 ; col <= (n - row) ; col ++) {
//                System.out.print("_");
//            }
//            System.out.print("*");
//            System.out.println();
//        }

        /*
            Given n as an input, print the following pattern
            N = 3
            - - *
            - * *
            * * *
            star + space = n
            star = n - space
            star = row
            space = n - row
         */
//        for (int row = 1 ; row <= n ; row++) {
//            for (int space = 1 ; space <= (n - row) ; space++) {
//                System.out.print(" - ");
//            }
//            for (int star = 1 ; star <= row; star++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

        /*
            Given n as an input, print the following pattern
            N = 4
            * * * * * * * *
            * * *     * * *
            * *         * *
            *             *

            star1 + spaces + star2 = 2 * n
            row + star1 = n + 1
            row + start2 = n + 1
            star1 = (n + 1) - row
            star2 = (n + 1) - row

            row is increasing by 1, and spaces are increasing by 2
            spaces = (2 * row - 2) spaces = 2 (Row - 1)
         */

//        for (int row = 1 ; row <= n ; row++) {
//            for (int star1 = 1 ; star1 <= ((n + 1) - row) ; star1++) {
//                System.out.print("*");
//            }
//            for (int spaces = 1 ; spaces <= (2 * row - 2) ; spaces++) {
//                System.out.print(" ");
//            }
//            for (int star2 = 1 ; star2 <= ((n + 1) - row) ; star2++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
            Given N as an input, print the following format

            N = 3
            - - * - -
            - * * * -
            * * * * *

            space1 = (n - row)
            star = ( 2 * row - 1)
            space2 = (n - row)
         */

        for (int row = 1 ; row <= n ; row++) {
            for (int spaces = 1 ; spaces <= (n - row) ; spaces++) {
                System.out.print(" ");
            }
            for (int star = 1 ; star <= (2 * row - 1) ; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
