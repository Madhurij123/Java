enum Laptop{
	MacBook(1200),ThinkPad(900),XPS,Surface(100);

	private int price;
	
	private Laptop() 
	{
        price = 50;
	}
	
	private Laptop(int price) 
	{
        this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
public class EnumLaptopClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Laptop[] l = Laptop.values();
 for(Laptop l1 : l) {
	    System.out.println(l1+" : "+l1.getPrice());
 }
	}

}
