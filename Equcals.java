package day2;
class Emp{
	private int id;

	public Emp(int id) {
		super();
		this.id = id;
	}
	public void show()
	{
		System.out.println(id);
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(!(obj instanceof Emp))
			return false;
		Emp other = (Emp) obj;
		if(this.id == other.id)
			return true;
		return false;
	}
}
public class Equcals {

	public static void main(String[] args) {

		Emp e1 = new Emp(101);
		Emp e2 = new Emp(101);
		
		boolean a = e1.equals(e2);
		System.out.println(a);
	}

}
