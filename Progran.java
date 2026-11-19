package print.stream;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Progran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeMovies();
	}
	public static void writeMovies()
	{
		List<Movie> list = new ArrayList<>();
		list.add(new Movie(1, "Star Wars", 7.5));
		list.add(new Movie(2, "Godfather", 8.0));
		list.add(new Movie(3, "Hidden Figures", 7.0));
		list.add(new Movie(4, "Bruce Almighty", 6.5));
		list.add(new Movie(5, "Forest Gump", 8.5));
		
		try(FileOutputStream fin = new FileOutputStream("Movies.txt")){
			try(PrintStream ps = new PrintStream(fin)){
				for(Movie m : list)
				{
					ps.printf("%-10d%-10s%-10.2f\n",m.getId(),m.getTitle(),m.getRating());
				}
			}
			System.out.println("Movies saved");

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
