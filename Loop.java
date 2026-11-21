
public class Loop {

	public static void main1(String[] args) {
		
	//while loop
		int i = 1;  
		int num = 10;
		while( i <= num)  //not allow in while direct declare a variable;
		{
			System.out.println(i);
			i++;
		}
	}
	
	//Do -while Loop
	public static void main1(String[] args)
	{
		int num = 20;
		int i = 0;
		do
		{
			System.out.println(i);
			i = i + 2;
		}while(i <= num);
	}
	
	//For Loop
	
     public static void main1(String[] args)
     {
    	 int num = 50;
    	 for(int i = 5; i <= num; i = i + 5)
    	 {
    		 System.out.println(i);
    	 }
     }
     
     //For each loop
     public static void main(String[] args)
     {
    	 int arr[] = {1, 2, 3, 4, 5};
         for(int ele : arr)
         {
        	 System.out.println(ele);
         }
     }
}
