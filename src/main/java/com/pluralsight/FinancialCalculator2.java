package com.pluralsight;
import java.util.Scanner;

public class FinancialCalculator2 {
    public static void main(String[] args) {

        int daysPerYear = 365;


        Scanner input = new Scanner(System.in);

        System.out.print("Enter your deposit: ");
        double principal  = input.nextDouble();

        System.out.print("Enter your interest rate (e.g. 5 for 5%): ");
        double interestRate = input.nextDouble() / 100;

        System.out.print("How long does the deposit last: ");
        int numberOfYears = input.nextInt();

        double futureValue = principal * Math.pow((1 + (interestRate / daysPerYear)), (daysPerYear * numberOfYears));
        double totalInterestEarned = futureValue - principal;

        System.out.printf("\nThe future value is $%.2f", futureValue);
        System.out.printf("\nThe total interest earned is $%.2f", totalInterestEarned);

        input.close();
    }
}
