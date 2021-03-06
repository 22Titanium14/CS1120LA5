/*
 *Assignment: CS1120 LA5_SP2017
 *Authors: Adam Dubs, Devin Anderson, Dylan Lafleur
 *Date: 03/20/2017
 *Reference: NA
 */

package edu.wmich.cs1120.la5;

public class Subtraction implements IOperation {

	/**
	 * Subtracts right value from left value
	 * @param left First value given by file
	 * @param right Second value given by file
	 * @return Returns subtraction of values
	 */
	public int perform(IExpression left, IExpression right) {
		return left.getValue() - right.getValue();
	}

}
