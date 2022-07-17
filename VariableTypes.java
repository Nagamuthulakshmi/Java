//Example for types of variables
public class VariableTypes {
    int rno=142; // Instance variable - common variable which belongs to the whole class and can be accessed from everywhere
    String initial="Jashwin"; //Instance Variable
    static String college = "MIT"; //Static Variable - variable created outside methods but inside class, has one time memory allocation
    static int phno = 894728123; //Static Variable
    public static void main(String args[]){
        int rollno=123; //Local Variable - variable created and destroyed witin the same function or block
        String name="Jeevesh"; //Local Variable - can be printed only inside this function alone
        System.out.println("Roll Number"+rollno+"Name:"+name);// Printing Local variable here itself
        VariableTypes day2Obj = new VariableTypes();
        day2Obj.display();
    }
    void display()
    {
        System.out.println("From Display Function: Rollno"+rno+"Name:"+initial); //Printing instance variables from display function
        System.out.println("Display static string variables:"+college+"Display static string variables:"+phno); // Printing static variables from a function
    }

}
