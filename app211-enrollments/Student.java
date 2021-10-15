
public class Student
{
    
    private int id;
   
    private String name;
    
    private Course course;
    
   // private Module module;
    
    // constructor 
    
    public Student(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public int getID()
    {
        return id;
    }
    public void enrol(Course course)
    {
        this.course = course;
    }
   
    public void print()
    {
        System.out.println(" Student ID: " + id + " Name: " + name);
    }
    
    public void printCourse()
    {
    course.print();
    }
}
