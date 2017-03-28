/*
 *Assignment: CS1120 LA5_SP2017
 *Authors: Adam Dubs, Devin Anderson, Dylan Lafleur
 *Date: 03/20/2017
 *Reference: NA
 */

package edu.wmich.cs1120.la5;

public class Literal implements IExpression {

	public int value;

	/**
	 * 
	 * @param value
	 */
	Literal(int value) {
		this.value = value;
	}
	/**
	 * getter method for the value field 
	 *@return = the value field  
	 */
	public int getValue() {
		return this.value;
	}

}
