package edu.wmich.cs1120.la5;

import edu.wmich.cs1120.la5.TerrainScanner;

public interface IMapCreator {

	/**
	 * 
	 * @param threshold 
	 * @param fileName 
	 */
	public void scanTerrain(int threshold, String fileName);

	/**
	 * 
	 */
	public void setScanner(TerrainScanner scanner);

	/**
	 * 
	 */
	public TerrainScanner getScanner(); 

}
