/*
 *Assignment: CS1120 LA5_SP2017
 *Authors: Adam Dubs, Devin Anderson, Dylan Lafleur
 *Date: 03/20/2017
 *Reference: NA
 */

package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class RadiationAnalyzer implements IRover {
	private ArrayList<IArea> path;
	private String analysis;
	/**
	 * 
	 */
	public void analyzePath() { 
		int idx = path.size();
		double totalRads = 0;
		for (int i = 0; i < idx; i++){
			totalRads+=path.get(i).getRadiation();
		}
		setAnalysis(String.format("The total Radiation is %.3f Rads", totalRads));
	 }

	/**
	 * This method sets the Array list of IArea type path that the rover will take 
	 * @param path = the path the rover will take 
	 */
	public void setPath(ArrayList<IArea> path) {this.path = path;}

	/**
	 * @return a String denoting the type of Analyzer being used. 
	 */
	public String getAnalysis() {return this.analysis;}

	/**
	 * This method gets the Array list of IArea type path that the rover will take 
	 * @return = the field path 
	 */
	public ArrayList<IArea> getPath() {return this.path;}

	/**
	 * Sets the analysis field 
	 * @param analysis the full analysis of the radiation of the path.
	 */
	public void setAnalysis(String analysis) {this.analysis = analysis;}

	/**
	 * @return = the name of the Analyzer  
	 */
	public String toString() {return "Radiation";}


}
