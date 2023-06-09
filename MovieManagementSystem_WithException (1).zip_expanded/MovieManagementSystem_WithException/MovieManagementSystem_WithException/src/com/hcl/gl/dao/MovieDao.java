package com.hcl.gl.dao;

import java.util.Scanner;

import com.hcl.gl.exception.NegativeException;
import com.hcl.gl.pojo.Movie;


public class MovieDao 
{
	Scanner sc=new Scanner(System.in);
	Movie movies[];   //Movies movies=new Movies[size];
	int size,noOfMovies;
	
	public MovieDao(int noOfMovies)  //constructor
	{
	  size=0;
	  this.noOfMovies=noOfMovies;
	  movies=new Movie[noOfMovies];
	}
	
	public void addMovie()
	{
		Movie movie=new Movie();
		System.out.println("Enter movieId: ");
		movie.setMovieId(sc.nextInt());
		System.out.println("Enter movie name: ");
		movie.setMovieName(sc.next());
		System.out.println("Enter movie text: ");
		movie.setMovieText(sc.next());
		System.out.println("Enter movie category: ");
		movie.setMovieCategory(sc.next());
		movies[size]=movie;
		size++;
		System.out.println("Movie added");
	}
	
	public void updateMovie() throws NegativeException             
	{
		int flag=0;  //status variable
		System.out.println("Enter the movie name to be updated: ");
		String movieName=sc.next();   //OLD MOVIE NAME
		
		for(int i=0;i<size;i++)
		{
			 if(movieName.equals(movies[i].getMovieName()))
			 {
				 System.out.println("Enter the updated movie name: ");
					String updatedMovie=sc.next();   //NEW NAME
				 movies[i].setMovieName(updatedMovie);
				 System.out.println("Movie name updated");
				 flag=1;
				 break;
			 }
		}
		if(flag==0)
		{
			try
			{
			throw new NegativeException("Movie does not exist");
			}
			catch(NegativeException ne)
			{
				System.out.println("Please try again!");
			}
		}
	}
	
	public void searchMovie() 
	{
		int flag=0;  //status variable
		System.out.println("Enter the movie name to be searched: ");
		String movieName=sc.next();   //OLD MOVIE NAME
		
		for(int i=0;i<size;i++)
		{
			 if(movieName.equals(movies[i].getMovieName()))
			 {
				 
				 System.out.println("Movie name searched : "+movies[i].getMovieName()+" "+movies[i].getMovieId());
				 flag=1;
				 break;
			 }
		}
		if(flag==0)
		{
			try {
				throw new NegativeException("Movie could not be searched");
			}
			catch(NegativeException ne)
			{
				System.out.println("Please try again!");
			}
		}
	}
	
	public void assigneeMovie()
	{
		int flag=0;  //status variable
		System.out.println("Enter the movie name to be be assigned to a user: ");
		String movieName=sc.next();   //OLD MOVIE NAME
		
		
		for(int i=0;i<size;i++)
		{
			 if(movieName.equals(movies[i].getMovieName()))
			 {
				 
				 System.out.println("Enter the name of the assignee user: ");
				 movies[i].setAssignedTo(sc.next());
				 flag=1;
				 break;
			 }
		}
		if(flag==0)
		{
			System.out.println("Movie does not exist");
		}
	}
	
	public void viewAllMovies()
	{
		for(int i=0;i<size;i++) {
		System.out.println(movies[i].getMovieId()+ " "+movies[i].getMovieName()+" "+movies[i].getAssignedTo());
		}
	}
//	movieName=sc.next();
//	assignedTo=sc.next()
//			for(int i=0;i<size;i++)
//			{
//				 if(movieName.equals(movies[i].getMovieName()))
//				 {
//					 
//					movies[i].setAssignedTo(assignedTo);
//					 flag=1;
//					 break;
//				 }
//			}	
	
}
