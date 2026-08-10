package day2;

class Student implements Cloneable {
    private int id;

    public Student(int id) {
        super();
        this.id = id;
    }

    public void show() {
        System.out.println(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (!(obj instanceof Student))
            return false;

        Student other = (Student) obj;

        if (this.id == other.id)
            return true;

        return false;
    }

    @Override
    public Student clone() throws CloneNotSupportedException
    {
    	return (Student) super.clone();
    }
}

public class Clonnable {
    public static void main(String[] args) {

        Student s1 = new Student(101);
        Student s2 = null;
		try {
			s2 = s1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        boolean a = s1.equals(s2);
        System.out.println(a);
    }
}