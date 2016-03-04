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
		
		System.out.println(myMovie.toString());
	}
	
	private String getActors(ArrayList<Actor> inputList) {
		String str = "";
		for(int i = 0; i <inputList.size(); i++){
			if(i!= inputList.size()-1){
				str += inputList.get(i) + ",";
			} else {
				str += inputList.get(i);
			}
			
		}
		return str;
	}
	
	
}
