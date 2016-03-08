package view;

import javax.swing.JFrame;
import javax.swing.JLabel;

import data.Movie;
import data.User;

public class MovieFrame extends JFrame {
	//The movie a page will be based on
	private Movie myMovie;

	//A User for if a user is logged in.
	private User myUser;

	//Labels for diplaying info about the movie.
	private JLabel title;
	private JLabel rating;
	private JLabel runTime;
	private JLabel releaseYear;
	private JLabel myActors;



	//A Movie Frame for when a user is not logged in.
	public MovieFrame(Movie inputMovie){
		super("Reel Log");
		myMovie = inputMovie;
		buildNotLoggedFrame();
	}

	//A Movie Frame for is a user is logged in.
	public MovieFrame(Movie inputMovie, User inputUser) {
		super("Reel Log");
		myMovie = inputMovie;
		myUser = inputUser;
		buildUserLoggedFrame();
	}

	private void buildNotLoggedFrame(){
		title = new JLabel(myMovie.getTitle());
		rating = new JLabel(myMovie.getMPAA());
		runTime = new JLabel(String.valueOf(myMovie.getRunTime()));
		releaseYear = new JLabel(String.valueOf(myMovie.getYear()));
		String actors = myMovie.getActors(myMovie.getActorList());

		myActors = new JLabel(actors);


	}

	private void buildUserLoggedFrame(){
		title = new JLabel(myMovie.getTitle());
		rating = new JLabel(myMovie.getMPAA());
		runTime = new JLabel(String.valueOf(myMovie.getRunTime()));
		releaseYear = new JLabel(String.valueOf(myMovie.getYear()));
		String actors = myMovie.getActors(myMovie.getActorList());

		myActors = new JLabel(actors);
	}




}
