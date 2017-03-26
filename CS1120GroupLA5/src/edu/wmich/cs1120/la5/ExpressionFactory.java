/*
 *Assignment: CS1120 LA5_SP2017
 *Authors: Adam Dubs, Devin Anderson, Dylan Lafleur
 *Date: 03/20/2017
 *Reference: NA
 */

package edu.wmich.cs1120.la5;

public class ExpressionFactory {

	/**
	 * 
	 * @param val2 
	 * @param val1 
	 * @param operator 
	 * @return 
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
