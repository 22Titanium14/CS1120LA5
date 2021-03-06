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
		double totalEnergy = 0;
		
		for (int index = 0; index < path.size(); index++) {
				totalEnergy += path.get(index).calcConsumedEnergy();
		}
		setAnalysis(String.format("The total Energy cost is %.3f", totalEnergy));
	 }

	/**
	 * Rover path setter
	 * @param path Path of rover represented by Area ArrayList
	 */
	public void setPath(ArrayList<IArea> path) {
		this.path = path;
	} 
	
	/**
	 * Rover path getter
	 * @return Returns path of rover
	 */
	public ArrayList<IArea> getPath() { 
		return this.path;
	 }
	
	/**
	 * Energy analysis setter
	 * @param analysis Analysis of total energy cost as string
	 */
	public void setAnalysis(String analysis) { 
		this.analysis = analysis;
	 }
	
	/**
	 * Energy analysis getter
	 * @return Returns total energy cost of path
	 */
	public String getAnalysis() { 
		return this.analysis;
	 }

	/**
	 * Identifies the analyzer subclass type
	 * @return Returns type of analyzer (energy)
	 */
	public String toString() { 
		return "Energy";
	 }

}
