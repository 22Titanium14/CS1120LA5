/*
 *Assignment: CS1120 LA5_SP2017
 *Authors: Adam Dubs, Devin Anderson, Dylan Lafleur
 *Date: 03/20/2017
 *Reference: NA
 */

package edu.wmich.cs1120.la5;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

import edu.wmich.cs1120.la5.TerrainScanner;

public class MapCreatorFromDat implements IMapCreator {

	private TerrainScanner scanner;

	/**
	 * 
	 * @param threshold
	 * @param fileName
	 */
	public void scanTerrain(String fileName, int threshold) throws IOException {
		// TODO Auto-generated method
		RandomAccessFile randFile = new RandomAccessFile(fileName, "r");
		ArrayList<Area> map = new ArrayList<Area>();
		
		int index = 0;
		while (index!=-1) {
			
			randFile.seek(index*34);
			double basicEnergyCost = randFile.readDouble();
			double elevation = randFile.readDouble();
			double radiation = randFile.readDouble();
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
			
			char operator = randFile.readChar();
			int left = randFile.readInt();
			int right = randFile.readInt();
			
			IExpression direction = ExpressionFactory.getExpression(left, right, operator);
			
			index = direction.getValue();
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

		randFile.close();

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
