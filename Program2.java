class Super
{
	protected Number calculate(Integer i ,Float f )
	{
		return 0;
	}
}
class  Sub extends Super
{
	public Number calculate(Integer i, Float f)  ///Return type give subclass ssame or wider than super class
	{
		return 0 ;
	}
}
public class Program2 {
public static void main(String[] args)
{
	Sub s = new Sub();
	s.calculate(1,2.0f);
}
}
