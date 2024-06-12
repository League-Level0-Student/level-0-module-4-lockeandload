package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String pennys = JOptionPane.showInputDialog("how many pennys? 1 cent");	
		double pennysdouble = Double.parseDouble(pennys);	
	String nickels = JOptionPane.showInputDialog("how many nickels? 5 cents");	
		double nickelsdouble = Double.parseDouble(nickels);
	String dimes = JOptionPane.showInputDialog("how many dimes? 10 cents");	
		double dimesdouble = Double.parseDouble(dimes);	
	String quarters = JOptionPane.showInputDialog("how many quarters? 25 cents");	
		double quartersdouble = Double.parseDouble(quarters);	
// Convert their answer to an double.   Hdouble: doubleeger.parsedouble()  
		pennysdouble = pennysdouble * 0.01;
		System.out.println(pennysdouble);
	nickelsdouble = nickelsdouble * 0.05;
System.out.println(nickelsdouble);
		// Ask the user how many dimes they have, and convert their answer
dimesdouble = dimesdouble * 0.10;
System.out.println(dimesdouble);
		// Ask the user how many quarters they have, and convert their answer
quartersdouble = quartersdouble * 0.25;
System.out.println(quartersdouble);
		// Calculate how much money the user has.  Hdouble: Use a double variable 
double totalCents = dimesdouble + quartersdouble + pennysdouble + nickelsdouble;
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
System.out.println(totalCents);
	
	
	
	
	
	
	
	
	
JOptionPane.showMessageDialog(null,"$" + totalCents + "¢");
	
	
	}
}

