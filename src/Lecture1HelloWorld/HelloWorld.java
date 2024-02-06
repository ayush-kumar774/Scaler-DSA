package Lecture1HelloWorld;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello World!!");
//        System.out.println(10);
//        System.out.println("5 * 10");

        // Basic Arithmetic Operations
//        System.out.println(10 * 5);

        // +
//        System.out.println("Aayush" + " Kumar");
//        System.out.println("Age is " + 23);
//        System.out.println(7 + 1 + "156"); // 8156 -> integer + string
//        System.out.println("156" + 7 + 1); // 15671 -> concatenated (left is string, so it will be treated as string)

        /*
            Data Types
            1. Primitive Data Type -> Predefined in Java
                Ex -> byte, short, int, long, float, boolean, char, double
                Numerical --> Integer (byte, short, int, long), Decimal (float, double)
                Non-numerical --> Character, Boolean

                Numerical
                Integer :
                    byte data type -> small value
                        range: (-128 to 127) (-2^7 to 2^7 -1)
                        size: 1 bytes (8 bits)

                    short data type ->
                        range (-32,768 to 32,767)--> (-2^15 to 2^15 -1)
                        size : 2 bytes (16 bits)

                     integer data type ->
                        range (-2147483648 to 2147483647) approx. (10^9 to 10^9 - 1 ) (-2^31 to 2^31 -1)
                        size : 4 byte (32 bits)

                     long data type ->
                        range (-9223372036854775808 to 9223372036854775807) approx. (10^18 to 10^18 - 1 ) (-2^63 to 2^63 - 1)

                        size : 8 bytes (64 bits)
                Decimal :
                    float ->
                        range (1.40239846e-45f to 3.40282347e+38f)
                        size : 4 bytes (32 bits)

                    double ->
                        range ()
                        size : 8 bytes (64 bits)



            2. Non-Primitive Data Type -> which are defined by programmer according to the need of the task
                Ex -> string, array, classes

               Types of typecasting:
                1. implicit typecasting: smaller to larger  (by default)
                2. explicit typecasting: larger to smaller (explicitly type casting)
         */


        int a = 100 ;
        System.out.println((long) a);
        long ans = 100000000000L ; // By default, integer are consider as int. To make it long we have to add L or l.
        a = (int) ans; // explicit
        System.out.println(a);

        // By default, decimal value are considered as double. To make it float we have to add F or f.
        float b = 89.12f;
        float c = (float)89.12;
        System.out.println(b + c);

        Scanner scanner = new Scanner(System.in);

//        int d = scanner.nextInt();
//        long e = scanner.nextLong();
//        float f = scanner.nextFloat();
//        double g = scanner.nextDouble();
//
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println(f);
//        System.out.println(g);

        // next and nextLine
        // next -> next reads the data till the time space is not encountered. (read only one word from input).
        // nextLine -> nextLine reads the entire line until it encounters new line.
//        String str = scanner.next();
//
//
//        String name1 = scanner.nextLine();
//        String name2 = scanner.nextLine();
//        System.out.println(name1 + " loves " + name2);

        // Question 1 : Take name1 (x) and name2 (y) as input and print x loves y.
        // Question 2 : Take name (x) and age (y) as input and print x age is y.

        for (int i = 5 ; i > 0 ; i--) {
            for (int j = i ; j > 0 ; j--) {
                System.out.print("");
            }
            System.out.println();
        }
    }
}
