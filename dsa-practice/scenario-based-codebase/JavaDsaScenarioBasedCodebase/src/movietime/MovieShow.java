package movietime;

import java.time.LocalTime;

public class MovieShow {
	String name;
	LocalTime time;
	
	public MovieShow(String name, LocalTime time) {
		this.name = name;
		this.time = time;
	}
	
	public LocalTime getTime() {
		return time;
	}
	
	public String toString() {
		return "Movie name: " + name +" | Show time: "+ time;
	}
}
