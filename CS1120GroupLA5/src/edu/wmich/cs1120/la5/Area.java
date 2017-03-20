package edu.wmich.cs1120.la5;

public class Area implements IArea {

	/**
	 * 
	 */
	private double radiation;
	/**
	 * 
	 */
	private double elevation;
	/**
	 * 
	 */
	private double basicEnergyCost;
	/**
	 * 
	 * @return 
	 */
	public double getRadiation() {
	 	 return radiation; 
	}
	/**
	 * 
	 * @param radiation 
	 */
	public void setRadiation(double radiation) { 
		 this.radiation = radiation; 
	}
	/**
	 * 
	 * @return 
	 */
	public double getElevation() {
	 	 return elevation; 
	}
	/**
	 * 
	 * @param elevation 
	 */
	public void setElevation(double elevation) { 
		 this.elevation = elevation; 
	}
	/**
	 * 
	 * @return 
	 */
	public double getBasicEnergyCost() {
	 	 return basicEnergyCost; 
	}
	/**
	 * 
	 * @param basicEnergyCost 
	 */
	public void setBasicEnergyCost(double basicEnergyCost) { 
		 this.basicEnergyCost = basicEnergyCost; 
	}
	/**
	 * 
	 * @return 
	 */
	public double calcConsumedEnergy() { 
		// TODO Auto-generated method
		return 0;
	 } 

}
