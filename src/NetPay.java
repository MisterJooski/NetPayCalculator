/*
 *
 * Purpose: The purpose of this program is help calculate a person's
 * gross and net pay based on the person's hourly wage, hours worked, 
 * and several withholdings.
 *
 */

import java.util.Scanner;

public class NetPay {

	public static void main(String[] args) {
		
		double FEDERAL_TAX_PERCENT = 10.00;
		double STATE_TAX_PERCENT = 4.5;
		double SS_PERCENT = 6.2;
		double MEDICARE_PERCENT = 1.45;
		double PAY_PER_HOUR = 7.25;
		int hoursPerWeek = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Hours per Week:\t\t");
		hoursPerWeek = keyboard.nextInt();
		
		double grossPay = PAY_PER_HOUR * hoursPerWeek;
		double federalDeduction = (FEDERAL_TAX_PERCENT/100) * grossPay;
		double stateDeduction = (STATE_TAX_PERCENT/100) * grossPay;
		double socialSecurity = (SS_PERCENT/100) * grossPay;
		double medicareDeduction = (MEDICARE_PERCENT/100)*grossPay;
		double totalDeduction = (federalDeduction + stateDeduction + 
												socialSecurity + medicareDeduction);
		double netPay = grossPay - totalDeduction;
		
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay + "\n");
		
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + federalDeduction);
		System.out.println("State:\t\t\t" + stateDeduction);
		System.out.println("Social Security:\t" + socialSecurity);
		System.out.println("Medicare:\t\t" + medicareDeduction);
	}

}
