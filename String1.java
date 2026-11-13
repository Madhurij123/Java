import java.util.Scanner;
class Program
{
	private String str;
	
	
	
	public String getStr() {
		return str;
	}



	public void setStr(String str) throws ExceptionLineTooLong{
		if(str.length() > 10)
			throw new ExceptionLineTooLong("str",str);
		this.str = str;
	}


	public void accept() throws ExceptionLineTooLong
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		str = sc.nextLine();
		setStr(str);
		
	}
	public void display()
	{
		System.out.println("String:"+str);
	}
}
public class String1 {

	public static void main(String[] args)
	{
		Program p = new Program();
		
		try {
			p.accept();
			p.display();
		}catch(ExceptionLineTooLong e)
		{
			System.out.println("InvalidField:"+e.getInvalidField());
			System.out.println("Invalid String:"+e.getInvalidString());
			System.out.println("Message:"+e.getMessage());
		}
	}
}
