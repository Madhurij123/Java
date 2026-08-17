import java.util.Scanner;

class Employee {
    private String fname;
    private String lname;
    private double salary;

    public Employee() {
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
    }

    public Employee(String fname, String lname, double salary) {
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public double getSalary() {
        if (salary > 0) {
            return salary * 1.10;
        } else {
            System.out.println("Salary must be positive..!!");
        }
        return 0;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("-----------------------------------------------");
        System.out.print("\nEnter a Employee First Name:");
        setFname(sc.next());
        
        System.out.print("\nEnter a Employee Last Name:");
        setLname(sc.next());
        
        System.out.print("\nEnter a Salary:");
        setSalary(sc.nextDouble());
        System.out.println("-----------------------------------------------");
    }

    public void display() {
        System.out.println("-----------------------------------------------");
        System.out.println("Employee First Name:" + fname);
        System.out.println("Employee Last Name:" + lname);
        System.out.println("Employee Salary:" + getSalary());
        System.out.println("-----------------------------------------------");
    }
}

public class Experiment_3 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.accept();
        e.display();
        System.out.println();

        Employee e1 = new Employee();
        e1.accept();
        e1.display();
    }
}
