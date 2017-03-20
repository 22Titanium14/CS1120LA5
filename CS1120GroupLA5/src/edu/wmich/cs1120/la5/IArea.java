/*
 *Assignment: CS1120 LA5_SP2017
 *Authors: Adam Dubs, Devin Anderson, Dylan Lafleur
 *Date: 03/20/2017
 *Reference: NA
 */

package edu.wmich.cs1120.la5;

public interface IArea {

	/**
	 * 
	 * @return 
	 */
	public double getRadiation();

	/**
	 * 
	 * @param elevation 
	 */
	public void setElevation(double elevation);

	/**
	 * 
	 * @return 
	 */
	public double getBasicEnergyCost();

	/**
	 * 
	 * @param basicEnergyCost 
	 */
	public void setBasicEnergyCost(double basicEnergyCost);

	/**
	 * 
	 * @return 
	 */
	public double calcConsumedEnergy();

	/**
	 * 
	 * @return 
	 */
	public double getElevation();

	/**
	 * 
	 * @param radiation 
	 */
	public void setRadiation(double radiation); 

}
