package data;

public class Movie {
	private String myTitle;
	private int myRunTime;
	private int myYear;
	private int myBoxOffice;
	private char myMpaa;
	private String movieID;
	
	public Movie(String id, String title, int runTime, int year, int boxOffice, char mpaa) {
		movieID = id;
		myTitle = title;
		myRunTime = runTime;
		myYear = year;
		myBoxOffice = boxOffice;
		myMpaa = mpaa;
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
	
	public char getMPAA(){
		return myMpaa;
	}
	
	public String getID(){
		return movieID;
	}
	
}
