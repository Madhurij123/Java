package day2;
interface accept
{
	void show();   //---by default absract method
}
interface display
{
	void show();
}
class Per implements accept,display{

	@Override
	public void show() {
		System.out.println("Welcome homw..!!");
		
	}
	
}
public class MultipleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //IN java there is allow create a refernece of interface but not a object;
		accept a = new Per();
		a.show();
		
		display b = new Per();
		b.show();
	}

}
