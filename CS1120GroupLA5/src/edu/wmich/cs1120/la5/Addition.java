/*
 *Assignment: CS1120 LA5_SP2017
 *Authors: Adam Dubs, Devin Anderson, Dylan Lafleur
 *Date: 03/20/2017
 *Reference: NA
 */

package edu.wmich.cs1120.la5;

public class Addition implements IOperation {

	/**
	 * 
	 * @param right
	 * @param left
	 * @return
	 */
	public int perform(IExpression left, IExpression right) {
		// TODO Auto-generated method
		return left.getValue() + right.getValue();
	}

}
