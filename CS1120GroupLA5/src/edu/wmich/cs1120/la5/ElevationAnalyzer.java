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
		
		for (int index = 0; index < path.size(); index++) {
			avgElevation = path.get(index).getElevation();
		}
		avgElevation /= path.size();
		setAnalysis(String.format("The average Elevation is  is %.3f Rads", avgElevation));
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
	 * Elevation analysis setter
	 * @param analysis Analysis of average elevation as string
	 */
	public void setAnalysis(String analysis) { 
		// TODO Auto-generated method
		this.analysis = analysis;
	 }
	
	/**
	 * Elevation analysis getter
	 * @return Returns average elevation of path
	 */
	public String getAnalysis() { 
		// TODO Auto-generated method
		return this.analysis;
	 }

	/**
	 * Identifies the analyzer subclass type
	 * @return Returns type of analyzer (elevation)
	 */
	public String toString() { 
		// TODO Auto-generated method
		return "Elevation";
	 }



}
