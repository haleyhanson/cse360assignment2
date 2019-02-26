
/*	Author: Haley Hanson
 *	Class ID: 395
 *	Assignment: 2
 *  Description: This file contains the Calculator class which acts as a calculator.
 *  A variable keeps track of the calculator's history and can be modified by 
 *  performing an operation with one integer at a time. 
 *  <p>
 *  The Calculator class contains 5 methods. The first four allow the private total 
 *  number to be modified with the following operations: adding, subtracting, 
 *  multiplying or dividing. The last method provides a history of the operations
 *  that took place. 
 *  
 * */
package cse360assign2;

public class Calculator 
{

	private int total;
	private String historyStr;		// string tracking the operation history
	
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
		historyStr = "0";
	}
	
	/**
	 * Gets the total
	 * 
	 * @return  	the total
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 * Adds an integer to the total variable
	 * 
	 * @param value		the integer that is added to total
	 */
	public void add (int value) 
	{
		total += value;
		historyStr += " + " + value;
	}
	
	/**
	 * Subtracts an integer from the total 
	 * 
	 * @param value		the integer that is subtracted from total
	 */
	public void subtract (int value) 
	{
		total -= value;
		historyStr += " - " + value;
	}
	
	/**
	 * Multiplies the total by an integer 
	 * 
	 * @param value		the integer that multiplies the total
	 */
	public void multiply (int value) 
	{
		total *= value;
		historyStr += " * " + value;
	}
	
	/**
	 * Divides the total by an integer
	 * 
	 * @param value		the integer that divides the total
	 */
	public void divide (int value) 
	{
		if(value == 0)
		{
			total = 0;
			historyStr = "0";
		}
		else
		{
			total /= value;
			historyStr += " + " + value;
		}
	}
	/**
	 * Prints a string of the calculator's history
	 * 
	 * @return historyStr	 string containing history of operations
	 */
	public String getHistory () 
	{
		return historyStr;
	}
}
