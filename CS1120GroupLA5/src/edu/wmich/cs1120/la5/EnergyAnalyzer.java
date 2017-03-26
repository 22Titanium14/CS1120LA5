/*
 *Assignment: CS1120 LA5_SP2017
 *Authors: Adam Dubs, Devin Anderson, Dylan Lafleur
 *Date: 03/20/2017
 *Reference: NA
 */

package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class EnergyAnalyzer implements IRover {
	
	private ArrayList<IArea> path;
	private String analysis;
	
	/**
	 * Analyzes the total energy cost of the path
	 */
	public void analyzePath() { 
		// TODO Auto-generated method
		double totalEnergy = 0;
		
		for (int index = 0; index < path.size(); index++) {
			//Multiply basicEnergyCost based on area type, add to running total
			if (path.get(index) instanceof HighArea) 
				totalEnergy += path.get(index).getBasicEnergyCost() * 4;
			else
				totalEnergy += path.get(index).getBasicEnergyCost() * 2;
		}
		setAnalysis(String.format("The total Energy is  is %.3f Rads", totalEnergy));
	 }

	/**
	 * Rover path setter
	 * @param path Path of rover represented by Area ArrayList
	 */
	public void setPath(ArrayList<IArea> path) {
		// TODO Auto-generated method stub
		this.path = path;
	} 
	
	/**
	 * Rover path getter
	 * @return Returns path of rover
	 */
	public ArrayList<IArea> getPath() { 
		// TODO Auto-generated method
		return this.path;
	 }
	
	/**
	 * Energy analysis setter
	 * @param analysis Analysis of total energy cost as string
	 */
	public void setAnalysis(String analysis) { 
		// TODO Auto-generated method
		this.analysis = analysis;
	 }
	
	/**
	 * Energy analysis getter
	 * @return Returns total energy cost of path
	 */
	public String getAnalysis() { 
		// TODO Auto-generated method
		return this.analysis;
	 }

	/**
	 * Identifies the analyzer subclass type
	 * @return Returns type of analyzer (energy)
	 */
	public String toString() { 
		// TODO Auto-generated method
		return "Energy";
	 }



}
