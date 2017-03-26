/*
 *Assignment: CS1120 LA5_SP2017
 *Authors: Adam Dubs, Devin Anderson, Dylan Lafleur
 *Date: 03/20/2017
 *Reference: NA
 */

package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class ElevationAnalyzer implements IRover {
	
	private ArrayList<IArea> path;
	private String analysis;
	
	/**
	 * Analyzes the average elevation of the path
	 */
	public void analyzePath() { 
		double avgElevation = 0;
		
		//Running total for loop for sum of elevation
		for (int index = 0; index < path.size(); index++) {
			avgElevation = path.get(index).getElevation();
		}
		avgElevation /= path.size(); //Divide total by size for average
		setAnalysis(String.format("The average Elevation is %.3f", avgElevation));
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
	 * Elevation analysis setter
	 * @param analysis Analysis of average elevation as string
	 */
	public void setAnalysis(String analysis) { 
		this.analysis = analysis;
	 }
	
	/**
	 * Elevation analysis getter
	 * @return Returns average elevation of path
	 */
	public String getAnalysis() { 
		return this.analysis;
	 }

	/**
	 * Identifies the analyzer subclass type
	 * @return Returns type of analyzer (elevation)
	 */
	public String toString() { 
		return "Elevation";
	 }

}
