 class Parent {
    void show()
    {
        System.out.println("Parents Shows");
    }
}
class child extends Parent
{
    void show()
    {
        System.out.println("child shows");
    }
}
public class Test
{
   public static void main(String args[])
   {
    child c = new child();
    c.show();

    Parent p = new Parent();
    p.show();
   }
}
