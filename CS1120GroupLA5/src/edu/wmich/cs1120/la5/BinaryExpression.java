/*
 *Assignment: CS1120 LA5_SP2017
 *Authors: Adam Dubs, Devin Anderson, Dylan Lafleur
 *Date: 03/20/2017
 *Reference: NA
 */

package edu.wmich.cs1120.la5;

public class BinaryExpression implements IExpression {

	private IExpression right;
	private IExpression left;
	private IOperation op;

	BinaryExpression(IOperation op, IExpression left, IExpression right) {
		this.op = op;
		this.left = left;
		this.right = right;
	}

	/**
	 * 
	 * @return
	 */
	public int getValue() {
		return op.perform(left, right);
	}

}
