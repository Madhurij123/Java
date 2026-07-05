import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.SortedMap;

public class CharacterStream {

	public static void main1(String[] args) {

		SortedMap<String, Charset> map =Charset.availableCharsets();
		
		System.out.println("Size:" +map.size());
	}
	
	public static void main(String[] args)
	{
		int data;
		try(FileReader fr = new FileReader("file1.txt")){
			while((data = fr.read()) != -1 )
			{
			System.out.print((char) data);	
			}
		}
		catch(Exception e)
		{
			
		}
	}

}
