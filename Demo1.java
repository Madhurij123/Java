interface B
{
	public int add(int i,int j);
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      B b =(i,j) -> i + j;
      
      int res = b.add(5, 3);   //havind single return statement i.e not need to write 
      System.out.println(res);
	}

}
