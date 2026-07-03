public class Student extends Person {

    private String name;
    private double marks;

    public Student(int id, String name, double marks) {
        super(id);
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [id=" + getId() + ", name=" + name + ", marks=" + marks + "]";
    }
}