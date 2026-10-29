//Comparable is standard used to comparing this  with other object

  ////-------------------------Using Object Class--------------
  
class Fraction1 implements Comparable
{
	private int n;
	private int d;
	
	public Fraction1(int n, int d)
	{
		this.n = n;
		this.d = d;
	}

	public double values()
	{
		double res = (double) n / d;
		return res;
	}
	@Override                   //Passes Object class
	public int compareTo(Object obj) {   //-----compareTo----used return differnce 
		Fraction1 other = (Fraction1) obj;  //Downcasting is manadatory         //between this and other
		if(this.values() == other.values())
			return 0;
		if(this.values() > other.values())
			return 1;
		else
			return -1;	
	}
	
	
}

public class Program1 {

	public static void main(String[] args) {

		Fraction1 f1 = new Fraction1(20,10); //1
		Fraction1 f2 = new Fraction1(20,20); //2
		
		int res = f1.compareTo(f2);
		System.out.println(res);

	}

}
