class Fraction
{
	private int n;
	private int d;
	
	public Fraction(int n, int d)
	{
		this.n = n;
		this.d = d;
	}
	public double value()
	{
		double res = (double) n / d;
		return res;
	}
	
	//this = f1
	//other = f2
	@Override
	public boolean equals(Object obj)
	{
		Fraction other = (Fraction) obj;
		if(this.value() == other.value())
		{
			return true;
		}
		return false;
	}
}
public class Program {

	public static void main(String[] args)
	{
		Fraction f1 = new Fraction(10,20);
		Fraction f2 = new Fraction(10,20);
	
		//equals() method use to comapring object state, return result either true / false
		boolean res = f1.equals(f2);
		System.out.println("Result:"+res);
	}
}
