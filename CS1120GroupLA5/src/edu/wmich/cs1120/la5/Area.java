/*
 *Assignment: CS1120 LA5_SP2017
 *Authors: Adam Dubs, Devin Anderson, Dylan Lafleur
 *Date: 03/20/2017
 *Reference: NA
 */

package edu.wmich.cs1120.la5;

public class Area implements IArea {
	
	private double basicEnergyCost;
	private double elevation;
	private double radiation;

	/**
	 * This method returns the value stored in this.basicEnergyCost.
	 */
	@Override
	public double getBasicEnergyCost() {
		return basicEnergyCost;
	}

	/**
	 * This method receives a double value as the parameter and stores it as
	 * this.basicEnergyCost.
	 * 
	 * @param basicEnergyCost
	 *            a double value to be stored as this.basicEnergyCost
	 */
	@Override
	public void setBasicEnergyCost(double basicEnergyCost) {
		// TODO Auto-generated method stub
		this.basicEnergyCost = basicEnergyCost;
	}

	/**
	 * This method returns the value stored in this.elevation.
	 */
	@Override
	public double getElevation() {
		return this.elevation;
	}

	/**
	 * This method receives a double value and stores it as this.elevation.
	 * @param elevation
	 *            a double value to be stored as this.elevation.
	 */
	@Override
	public void setElevation(double elevation) {
		this.elevation = elevation;
	}

	/**
	 * This method returns the value stored in radiation
	 */
	@Override
	public double getRadiation() {
		return this.radiation;
	}

	/**
	 * This method receives a double value and sets it to this.radiation.
	 * 
	 * @param radiation
	 *            the double value to be stored as radiation
	 */
	@Override
	public void setRadiation(double radiation) {
		this.radiation = radiation;
	}

	/**
	 * An Area is assumed impassable if it is neither high nor low area.
	 * Therefore, this super-method returns a zero.
	 */
	@Override
	public double calcConsumedEnergy() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
