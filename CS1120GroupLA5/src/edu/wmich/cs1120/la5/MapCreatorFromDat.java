/*
 *Assignment: CS1120 LA5_SP2017
 *Authors: Adam Dubs, Devin Anderson, Dylan Lafleur
 *Date: 03/20/2017
 *Reference: NA
 */

package edu.wmich.cs1120.la5;

import java.io.IOException;

import edu.wmich.cs1120.la5.TerrainScanner;

public class MapCreatorFromDat implements IMapCreator {
	
	private TerrainScanner scanner;
	/**
	 * 
	 * @param threshold 
	 * @param fileName 
	 */
	public void scanTerrain(String fileName, int threshold) throws IOException{ 
		// TODO Auto-generated method
	 }

	/**
	 * 
	 */
	public void setScanner(TerrainScanner scanner) { 
		// TODO Auto-generated method
		this.scanner = scanner;
	 }

	/**
	 * 
	 */
	public TerrainScanner getScanner() { 
		// TODO Auto-generated method
		return this.scanner;
	 } 

}
