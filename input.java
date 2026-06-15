import java.util.Scanner;

public class input {
    int roll_no;
    Scanner sc = new Scanner(System.in);

    void getdata()
    {
        System.out.println("Enter roll number:");
        roll_no = sc.nextInt();
    }
    void display()
    {
        System.out.print("Roll No:" +roll_no);
    }
}

class Test
{
    public static void main(String[] args) {
        input i = new input();
        i.getdata();
        i.display();
    }
}
