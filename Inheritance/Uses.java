package Inheritance;
//Overloading, Overriding, Upcast, Downcast
class Details{
    String name= "Naga";
    int age = 20;
    public void display(){
        System.out.println("Display function of Details class");
    }
    public void display(String name){
        System.out.println(name+" from Details Display function");
    }
}

class Child extends Details{
    String college = "ITVedant";
    public void display(){//This display function will be called by u object not Details display() fn
        System.out.println(name+" "+age+" "+college);
        super.display();// add super to jump from this display to that display
    }
    public void display(String name){
        System.out.println(name+" from Child Display function");
    }
}

public class Uses{
    
    public static void main(String[] args) {

        Details di = new Details();
        di.display();
        di.display("Rekha");

        Child c = new Child();
        c.display();// calls child display 
        c.display("Rekha");

        //Upcast object is a parent object but helps to access the child overriden method
        Details d = new Child();
        d.display("Rekha");// calls child display method
    
        /*Downcasting : Is not directly possible in Java.
         * Child c = new Parent();
         * The above program will not work. it is compile time error.
         * This is not possible because all the members of child class are not available in parent,
         * So biggest mystery can happen if we call c.OnlyChildShow();
         * It compiles successfully but at runtime there is no such method with parent’s object.
         * So, no direct downcasting is supported in Java but we can do upcasting and then we can use that variable for downcasting as below
            Parent p = new Child();
            Child c =(Child) p;

         *  Downcasting will not happen automatically like upcasting,we have to cast it explicitly like we did above (Child)p.
         * Here it looks like a Downcasting but not exactly what we expect(giving parent’s object to child’s reference variable)
         * It’s putting parent’s reference variable holding child’s object to child’s reference variable.
         * It is almost equivalent to
            
            Child c = new Child();
            
            --But indirectly using parent’s reference variable as temp.

         */
    
    }
}
