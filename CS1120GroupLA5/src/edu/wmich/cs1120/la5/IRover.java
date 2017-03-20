package edu.wmich.cs1120.la5;

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
	public void setPath(IArea path);

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
