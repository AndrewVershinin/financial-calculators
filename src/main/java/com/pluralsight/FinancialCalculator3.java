package com.pluralsight;
import java.util.Scanner;

public class FinancialCalculator3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your monthly payout: ");
        double monthlyPayout  = input.nextDouble();

        System.out.print("Enter your interest rate (e.g. 5 for 5%): ");
        double interestRate = input.nextDouble() / 100;

        System.out.print("Years for pay out: ");
        int payOutYears = input.nextInt();

        int numberOfPeriods = payOutYears * 12;
        double periodInterestRate = interestRate / 12;

        double presentValue = monthlyPayout * ((1 - Math.pow((1 + periodInterestRate), -(numberOfPeriods))) / periodInterestRate);

        System.out.printf("\nThe present value of annuity is $%.2f", presentValue);

        input.close();
    }
}
