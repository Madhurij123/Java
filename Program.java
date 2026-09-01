public class Program
{
    public static void main(String[] args) {
        
        System.out.println("class Demo1");
        Program.main(10,20);
        Program.main();
    }

public static void main(int a, int b)
{
    System.out.println(" two argument");
}

public static void main()
{
    System.out.println(" Empty Method");
}
}