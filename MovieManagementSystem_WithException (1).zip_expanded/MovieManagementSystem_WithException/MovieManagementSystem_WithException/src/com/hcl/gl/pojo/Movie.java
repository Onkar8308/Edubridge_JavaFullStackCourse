package com.hcl.gl.pojo;

import java.util.Date;

//POJO: plain java class file which will only contain variables, constructors and getter and setter function
//PLAIN OLD JAVA OBJECT

//does the work of assigning and fetching values of a variable

public class Movie 
{
	private int movieId;
	private String movieName;
	private String movieText;
	private String movieCategory;
	private String assignedTo;
	private String completionDate; //12-10-2000
	public int getMovieId() 
	{
		return movieId;
	}
	public void setMovieId(int movieId) 
	{
		this.movieId = movieId;
	}
	public String getMovieName() 
	{
		return movieName;
	}
	public void setMovieName(String movieName) 
	{
		this.movieName = movieName;
	}
	public String getMovieText() 
	{
		return movieText;
	}
	public void setMovieText(String movieText) 
	{
		this.movieText = movieText;
	}
	public String getMovieCategory() 
	{
		return movieCategory;
	}
	public void setMovieCategory(String movieCategory)
	{
		this.movieCategory = movieCategory;
	}
	public String getAssignedTo() {
		return assignedTo;
	}
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	
	
	//CREATE GETTER AND SETTER
	
}
