/*
 *Assignment: CS1120 LA5_SP2017
 *Authors: Adam Dubs, Devin Anderson, Dylan Lafleur
 *Date: 03/20/2017
 *Reference: NA
 */

package edu.wmich.cs1120.la5;

public class HighArea extends Area {

	/**
	 * This method returns the energy needed to pass a high area.
	 */
	@Override
	public double calcConsumedEnergy(){
		return getBasicEnergyCost()*4;
	}
}
