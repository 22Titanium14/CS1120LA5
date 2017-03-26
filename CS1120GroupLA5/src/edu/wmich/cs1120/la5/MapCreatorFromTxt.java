/*
 *Assignment: CS1120 LA5_SP2017
 *Authors: Adam Dubs, Devin Anderson, Dylan Lafleur
 *Date: 03/20/2017
 *Reference: NA
 */

package edu.wmich.cs1120.la5;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import edu.wmich.cs1120.la5.TerrainScanner;

public class MapCreatorFromTxt implements IMapCreator {
	
	private TerrainScanner scanner = new TerrainScanner();

	/**
	 * This method reads a file given by the fileName containing data for each area. It then checks, based on the data
	 * from the file, if the area is high area, low area, or impassable. It then loads all areas into a square double array
	 * based upon the number of areas. It then calls scanner.setTerrian() and send the double array as the argument.
	 * @param fileName a string of the file name that is to be read
	 * @param threshold the max int value that the elevation can be to be considered passable exclusive
	 */
	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		Scanner read = new Scanner(new File(fileName));
		ArrayList<Area> map = new ArrayList<Area>();
		while (read.hasNextLine() == true) {
			String temp = read.nextLine();
			String temp1[] = temp.split(" ");
			double basicEnergyCost = Double.parseDouble(temp1[0]);
			double elevation = Double.parseDouble(temp1[1]);
			double radiation = Double.parseDouble(temp1[2]);
			if (elevation >= threshold) {
				Area tempA = new Area();
				tempA.setBasicEnergyCost(basicEnergyCost);
				tempA.setElevation(elevation);
				tempA.setRadiation(radiation);
				map.add(tempA);
			} else if (radiation >= 0.5 || (radiation < 0.5 && elevation > threshold * 0.5)) {
				Area tempA = new HighArea();
				tempA.setBasicEnergyCost(basicEnergyCost);
				tempA.setElevation(elevation);
				tempA.setRadiation(radiation);
				map.add(tempA);
			} else {
				Area tempA = new LowArea();
				tempA.setBasicEnergyCost(basicEnergyCost);
				tempA.setElevation(elevation);
				tempA.setRadiation(radiation);
				map.add(tempA);
			}
		}

		int side = (int) Math.round(Math.sqrt(map.size()));

		Area terrain[][] = new Area[side][side];
		int n = 0;

		for (int i = 0; i < terrain.length; i++) {
			for (int j = 0; j < terrain[0].length; j++) {
				terrain[i][j] = map.get(n);
				n++;
			}
		}

		scanner.setTerrain(terrain);

		read.close();
	}

	/**
	 * This method returns this.scanner;
	 */
	@Override
	public TerrainScanner getScanner() {
		return this.scanner;
	}

	/**
	 * This method receives a TerrainScanner object and saves it to this.scanner.
	 * @param scanner the TerrainScanner object to be stored in this.scanner.
	 */
	@Override
	public void setScanner(TerrainScanner scanner) {
		this.scanner = scanner;
	} 

}
