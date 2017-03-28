/*
 *Assignment: CS1120 LA5_SP2017
 *Authors: Adam Dubs, Devin Anderson, Dylan Lafleur
 *Date: 03/20/2017
 *Reference: NA
 */

package edu.wmich.cs1120.la5;

import java.util.ArrayList;
import java.util.List;

public interface IRover {

	/**
	 * Analyzes path according to the type of analyzer.  
	 */
	public void analyzePath();

	/**
	 * This method sets the Array list of IArea type path that the rover will take 
	 * @param path = the path the rover will take 
	 */
	public void setPath(ArrayList<IArea> path);

	/**
	 * @return a String denoting the type of Analyzer being used. 
	 */
	public String getAnalysis();

	/**
	 * This method gets the Array list of IArea type path that the rover will take 
	 * @return = the field path 
	 */ List<IArea> getPath();

	/**
	 * Sets the analysis field 
	 * @param analysis the full analysis of the radiation of the path.
	 */
	public void setAnalysis(String analysis);

	/**
	 * @return = the name of the Analyzer  
	 */
	public String toString(); 

}
