import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

public class FileWriter1 {

	public static void main1(String[] args) {

		try(FileWriter fw = new FileWriter("File2.txt")){
			fw.write("Dkte Ichalakranji");
		}
		catch(Exception e)
		{
			
		}
	}
	
	public static void main(String[] args)
	{
		try(FileOutputStream fout = new FileOutputStream("File2.txt")){
			try(OutputStreamWriter out = new OutputStreamWriter(fout)){
				out.write("Sunbeam Infotech....!!!");
			}
		}catch(Exception e) {
			
		}
	}

}
