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
	 * 
	 */
	public void analyzePath();

	/**
	 * 
	 * @param path 
	 */
	public void setPath(ArrayList<IArea> path);

	/**
	 * 
	 * @return 
	 */
	public String getAnalysis();

	/**
	 * 
	 * @return 
	 */
	public List<IArea> getPath();

	/**
	 * 
	 * @param analysis 
	 */
	public void setAnalysis(String analysis);

	/**
	 * 
	 * @return 
	 */
	public String toString(); 

}
