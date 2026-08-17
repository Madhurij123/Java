
public class Patterns {

	public static void main(String[] args) {

		/*for(int i = 0; i < 5; i++ )
		{
			for(int j = 0; j < i; j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}*/
		
		/*for(int i = 0; i < 5; i++ )
		{
			for(int j = 0; j < i; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}*/
		
		/*for(int i = 0; i < 5; i++ )
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}*/
		
		//----------Traingle-------
		/*//rows
		for(int i = 0; i < 5; i++)
		{
			//for space
			for(int j = 1; j < 5 - i; j++) {
				System.out.print(" ");
			}
			
			//for * print
			for(int j = 1; j <= i ; j++ ) {
				System.out.print(i+" ");
			}
         System.out.println();
		}*/
		
		/*for(int i = 5; i >= 1; i-- )
		{
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}*/
		
		//-----------------Pyramid--------
		for(int i = 0; i < 5; i++)
		{
			//for space
			for(int j = 1; j < 5 - i; j++) {
				System.out.print(" ");
			}
			
			//for * print
			for(int j = 1; j <= i ; j++ ) {
				System.out.print("*"+" ");
			}
         System.out.println();
		}
		for(int i = 5; i >= 1; i--)
		{
			for(int j = 1; j < 5 - i; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
