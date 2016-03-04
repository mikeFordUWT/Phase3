package view;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;

import data.Actor;
import data.Movie;

public class MovieFrame extends JFrame {
	private Movie myMovie;
	
	//Labels for diplaying info about the movie.
	private JLabel title;
	private JLabel rating;
	private JLabel runTime;
	private JLabel releaseYear;
	private JLabel myActors;
	
	
	
	public MovieFrame(Movie inputMovie){
		super("Reel Log");
		myMovie = inputMovie;
		buildFrame();
	}
	
	private void buildFrame(){
		title = new JLabel(myMovie.getTitle());
		rating = new JLabel(myMovie.getMPAA());
		runTime = new JLabel(String.valueOf(myMovie.getRunTime()));
		releaseYear = new JLabel(String.valueOf(myMovie.getYear()));
//		myActors = new JLabel(myActors.toString());
		
//		System.out.println(getActors(myMovie.getActors()));
	}
	
	
	
	
}
