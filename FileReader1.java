import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileReader1 {

	public static void main(String[] args) {

		int data;
		
		try(FileInputStream fin = new FileInputStream("file1.txt")){
			try(InputStreamReader fr = new InputStreamReader(fin)){
				while((data = fr.read()) != -1) {
					System.out.print((char)data);
				}
			}
		}catch(Exception e)
		{
		e.printStackTrace();
		}
	}

}
