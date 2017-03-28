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
	 * Reads terrain file and stores result 
	 * @param threshold: determines the what is the highest passable terrain 
	 * @param fileName: the name of the terrain file (MUST BE IN PACKAGE) 
	 */
	public void scanTerrain(String fileName, int threshold) throws IOException;

	/**
	 * This method returns this.scanner;
	 */
	public void setScanner(TerrainScanner scanner);

	/**
	 * This method receives a TerrainScanner object and saves it to this.scanner.
	 * @param scanner the TerrainScanner object to be stored in this.scanner.
	 */
	public TerrainScanner getScanner(); 

}
