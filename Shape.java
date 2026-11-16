package clg.dkte;

public interface Shape
{
	double pi = 3.14;
    double calAreas();
    
    //----------static methods allow-------
    public static double cal(Shape[] arr)
    {
    	double total = 0.0;
    	for(int i = 0; i < arr.length; i++)
    	{
    		total = total + arr[i].calAreas();
    	}
    	return total;
    }
    //------------default method allow--------
    default double calPeri()
    {
    	return 0.0;
    }
}

