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
