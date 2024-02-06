package Lecture2IfElse.Assignment;

import java.util.Scanner;

public class ConfusionInElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();
        double bill = 0.0;

        if (unit > 50) {
            bill += 50 * 0.50 ;
            unit -= 50 ;
        } else {
            bill += unit * 0.50;
            unit = 0;
        }
        // Calculate bill for next 100 units
        if (unit > 100) {
            bill += 100 * 0.75;
            unit -= 100;
        } else {
            bill += unit * 0.75;
            unit = 0;
        }
        // Calculate bill for next 100 units
        if (unit > 100) {
            bill += 100 * 1.20;
            unit -= 100;
        } else {
            bill += unit * 1.20;
            unit = 0;
        }

        // Calculate bill for remaining units
        bill += unit * 1.50;

        // Add 20% surcharge
        bill *= 1.20;

        System.out.println((int)bill);
        System.out.println(bill(150));
    }
    public static int bill(int unit) {
        double bill = 0.0;
        if (unit <= 50) {
            bill = (unit * 0.50);
        }
        else if (unit <= 150) {
            bill = (unit - 50) * 0.75 + 25; // (50 * 0.50 = 25)
        }
        else if (unit <= 250) {
            bill =  (unit - 150) * 1.20 + 100 ; // (100 * 0.75 = 75) + (50 * 0.50 = 25)
        }
        else {
            bill = 220 + (unit - 250) * 1.50; // (100 * 1.20 = 120) + (100 * 0.75 = 75) + (50 * 0.50 = 25)
        }
        bill += ((bill * 20) / 100 );
//        System.out.println("Bill = " + bill);
        return (int) bill;
    }
}
/*
Calculating the Bill:

The program then calculates the bill in stages, depending on the number of units used.
For the first 50 units, the cost is Rs. 0.50 per unit. So, if you used 30 units, your bill would be 30 units x Rs. 0.50. But if you used more than 50 units, say 70, the bill for the first 50 units would be 50 units x Rs. 0.50.
For the next 100 units (units 51 to 150), the cost is Rs. 0.75 per unit. So, continuing the previous example where you used 70 units, the bill for the next 20 units (out of 70) would be 20 units x Rs. 0.75.
For the next 100 units (units 151 to 250), the cost increases to Rs. 1.20 per unit.
For any units above 250, the cost is Rs. 1.50 per unit.
Adding a Surcharge:

Once the bill is calculated based on units used, an additional surcharge of 20% is added to this amount. This is like a tax or extra charge on top of your bill.
Final Bill:

The final step in the program is to convert the total bill amount into an integer. This is because the bill, with all its calculations, might end up being a number with decimal points (like Rs. 123.45), but you usually pay in whole numbers. So, the program rounds down the amount to the nearest whole number. For example, if the final bill is Rs. 123.45, you'll pay Rs. 123.
Displaying the Bill: Finally, the program displays the total bill amount that needs to be paid, based on the units of electricity used.
 */