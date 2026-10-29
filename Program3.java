class Fraction3 implements Comparable<Fraction3>
{
	private int n;
	private int d;
	
	public Fraction3(int n, int d)
	{
		this.n = n;
		this.d = d;
	}
	public double values()
	{
		double res = (double) n / d;
		return res;
	}
	@Override
	public int compareTo(Fraction3 other) {
		if(this.values() == other.values())
			return 0;
		if(this.values() > other.values())
			return 1;
		else
			return -1;
	}
	/*@Override
	public int compareTo(Fraction3 other) {
		int diff = (int) (this.values() - other.values());
		return diff;
	}*/
	/*@Override
	public int compareTo(Fraction3 other) {
		int diff = (int) (other.values() - this.values());
		return diff;
	}*/
}
public class Program3
{
	public static void main(String[] args)
	{
		Fraction3 a = new Fraction3(20,10); 
		Fraction3 b = new Fraction3(20,20);
		
		int res = a.compareTo(b);
		System.out.println(res);
	}
}