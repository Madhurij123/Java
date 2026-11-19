import java.io.File;
import java.sql.Date;
import java.util.Scanner;

public class File1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a path:");
		String srcPath = sc.next();
		
		File file = new File(srcPath);
		
		if(!file.exists()){
			System.out.println("File not found..!!");
			System.exit(0);
		}
		if(file.isDirectory())
		{
			String[] lst = file.list();
			for(String l : lst)
			{
				System.out.println(l.toString());
			}
		}
		else if(file.isFile())
		{
			System.out.println("File Name:"+file.getName());
			System.out.println("Parent Name:"+file.getParent());
			System.out.print("File Permission:");
			if(file.canExecute())
				System.out.print("Executable, ");
			if(file.canRead())
				System.out.print("Readable, ");
			if(file.canWrite())
				System.out.print("Writable,");
			
			long lst = file.lastModified();
			System.out.println("Last Modified Date:"+new Date(lst));
		}
		else
		{
			System.out.println("Neither directory not file..!!");
		}
	}

}
