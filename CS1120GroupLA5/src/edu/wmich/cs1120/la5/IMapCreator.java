/*
 *Assignment: CS1120 LA5_SP2017
 *Authors: Adam Dubs, Devin Anderson, Dylan Lafleur
 *Date: 03/20/2017
 *Reference: NA
 */

package edu.wmich.cs1120.la5;

import java.io.IOException;

import edu.wmich.cs1120.la5.TerrainScanner;

public interface IMapCreator {

	/**
	 * 
	 * @param threshold 
	 * @param fileName 
	 */
	public void scanTerrain(String fileName, int threshold) throws IOException;

	/**
	 * 
	 */
	public void setScanner(TerrainScanner scanner);

	/**
	 * 
	 */
	public TerrainScanner getScanner(); 

}
