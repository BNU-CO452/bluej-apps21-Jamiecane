
/**
 * This class Module represents the code, title and credit value
 *
 * @author Jamie Cane
 * @version 12/10/21
 */
public class Module
{
    private String code;
    private String title;
    private int credit;

    // constructor for objects of the class module
    public Module(String code, String title)
    {

      this.code = code;
      this.title = title;
      credit = 0;
      
    }
    // method to get module code
    
    public String getCode()
    {
        return code;
    }
    // method to get module title
    
    public String getTitle()
    {
        return title;
    }
    // method to return module credit amount
    
    public int getCredit()
    {
        return credit;
    }
    // method to change credit amount for student
    
    public void setCredit(int credit)
    {
        this.credit = credit;
    }
    // print method for module
    
    public void print()
    {
        System.out.println(" Module Code: " + code + ": " + title);
        System.out.println(" Credit: " + credit);
    }
}
