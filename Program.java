import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();

        list.add(new Employee(1,"abc",2000));
        list.add(new Student(4,"xyz",100));
        list.add(new Employee(3,"abc",2000));
        list.add(new Student(2, "xyz",100));
        list.add(new Employee(5,"abc",2000));
        list.add(new Student(6,"xyz", 100));
       
        System.out.println("---------Before Sorting------------:");
        for (Person p : list) 
        {
            System.out.println(p);
        }
        System.out.println();

      
        class PersonIdComparator implements Comparator<Person> {

            @Override
            public int compare(Person x, Person y) {
                return Integer.compare(x.getId(), y.getId());
            }
        }

        list.sort(new PersonIdComparator());
        
        System.out.println("-------------After Sorting--------------:");
        for (Person p : list) 
        {
            System.out.println(p);
        }
    }
}