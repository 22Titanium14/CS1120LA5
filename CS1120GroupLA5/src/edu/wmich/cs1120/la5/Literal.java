/*
 *Assignment: CS1120 LA5_SP2017
 *Authors: Adam Dubs, Devin Anderson, Dylan Lafleur
 *Date: 03/20/2017
 *Reference: NA
 */

package edu.wmich.cs1120.la5;

public class Literal implements IExpression {

	/**
	 * 
	 */
	public int value;

	/**
	 * 
	 * @return 
	 */
	public int getValue() {
	 	 return value; 
	}

	/**
	 * Setter of value
	 */
	public void setValue(int value) { 
		 this.value = value; 
	}

	/**
	 * 
	 * @param value 
	 */
	public void Literal(int value) { 
		// TODO Auto-generated method
	 } 

}
