/*
 *Assignment: CS1120 LA5_SP2017
 *Authors: Adam Dubs, Devin Anderson, Dylan Lafleur
 *Date: 03/20/2017
 *Reference: NA
 */

package edu.wmich.cs1120.la5;

public class ExpressionFactory {

	/**
	 * This method creates a class system need for the .dat file access operations  
	 * @param left: 1st numerical expression 
	 * @param right: 2nd numerical expression 
	 * @param operator: char that determines how to handle the numerical expressions.
	 * @return: an Iexpression type object with the solution 
	 */
	public static IExpression getExpression(int left, int right, char operator) { 
		Literal nLeft = new Literal(left);
		Literal nRight = new Literal(right);
		IOperation nOperator = new Addition();  //<--This method currently assumes that the .dat file is in correct format
		switch(operator){
		case '+':
			nOperator = new Addition();
			break;
		case '-':
			nOperator = new Subtraction();
			break;
		}
		return new BinaryExpression(nOperator, nLeft, nRight);
	 } 

}
