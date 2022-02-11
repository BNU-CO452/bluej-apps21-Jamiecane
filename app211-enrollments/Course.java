import java.util.*;

/**
 * This class contains information about an undergraduate course
 * at BNU together with a list of students who are enrolled
 *
 * @author Jamie Cane
 * @version 1.0 12/10/2021
 */
public class Course
{
    // A unique identifier - BT1GDV1
    private String code;
    // The full title including qualification and subject
    private String title;
    // Method to add a module to the course
    private Module module;
    
    // Course object
    public Course(String code, String title)
    {
        this.code = code;
        this.title = title;
      
    }
    
    // Method to assign module to course
    public void assignModule(Module module)
    {
    this.module = module;
    } 
    //Print method
    public void print()
    {
        
        System.out.println(" Course Code: " + code + ": " + title);
     //   module.print();
    }
        public void printModule(Module module)
    {
        module.print();
    }
    /**
     * Print out the details of the course to the terminal.
     */
    private void printHeading()
    {
        System.out.println(" --------------------------------");
        System.out.println("   App211: Course Details");
        System.out.println(" --------------------------------");
        System.out.println();
    }

}
