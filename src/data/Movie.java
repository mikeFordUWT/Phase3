package data;

import java.util.ArrayList;

public class Movie {
	private String myTitle;
	private int myRunTime;
	private int myYear;
	private int myBoxOffice;
	private String myMpaa;
	private String movieID;
	private ArrayList<Actor> myActors;

	public Movie(String id, String title, int runTime, int year, int boxOffice, String mpaa) {
		movieID = id;
		myTitle = title;
		myRunTime = runTime;
		myYear = year;
		myBoxOffice = boxOffice;
		myMpaa = mpaa;
		myActors = new ArrayList<Actor>();
	}

	public String getTitle(){
		String title = myTitle;
		return title;
	}

	public int getRunTime(){
		return myRunTime;
	}

	public int getYear(){
		return myYear;
	}

	public int getBoxOffice(){
		return myBoxOffice;
	}

	public String getMPAA(){
		return myMpaa;
	}

	public String getID(){
		return movieID;
	}

	public void addActor(Actor inputActor){
		myActors.add(inputActor);
	}
	
	public ArrayList<Actor> getActors(){
		return myActors;
	}

	@Override
	public String toString(){
		String run = String.valueOf((myRunTime/60)) + "hr " + String.valueOf(myRunTime%60) + "mins";
		
		return myTitle + "\n" + myMpaa + " | " + run + "\n" 
				+ myActors.toString() + "\n" + myBoxOffice;
	}
	
}
