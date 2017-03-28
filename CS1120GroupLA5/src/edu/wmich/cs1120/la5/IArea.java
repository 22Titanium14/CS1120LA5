/*
 *Assignment: CS1120 LA5_SP2017
 *Authors: Adam Dubs, Devin Anderson, Dylan Lafleur
 *Date: 03/20/2017
 *Reference: NA
 */

package edu.wmich.cs1120.la5;

public interface IArea {

	/**
	 * This method returns the value stored in radiation
	 */
	public double getRadiation();


	/**
	 * This method receives a double value and stores it as this.elevation.
	 * @param elevation
	 *            a double value to be stored as this.elevation.
	 */
	public void setElevation(double elevation);

	/**
	 * This method returns the value stored in this.basicEnergyCost.
	 */
	public double getBasicEnergyCost();
	/**
	 * This method receives a double value as the parameter and stores it as
	 * this.basicEnergyCost.
	 * 
	 * @param basicEnergyCost
	 *            a double value to be stored as this.basicEnergyCost
	 */
	public void setBasicEnergyCost(double basicEnergyCost);

	/**
	 * An Area is assumed impassable if it is neither high nor low area.
	 * Therefore, this super-method returns a zero.
	 */
	public double calcConsumedEnergy();

	/**
	 * This method returns the value stored in this.elevation.
	 */
	public double getElevation();

	/**
	 * This method receives a double value and sets it to this.radiation.
	 * 
	 * @param radiation
	 *            the double value to be stored as radiation
	 */
	public void setRadiation(double radiation); 

}
