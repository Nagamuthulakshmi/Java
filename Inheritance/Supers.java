package Inheritance;

class Parents{
    String name = "Naga";

    public Parents(){
        System.out.println(name + " from Parent Constructor");
    }
    public void display(){
        System.out.println(name+" :Name from Parent display()");
        
    }

}

class Childs extends Parents{
    String name = "Lakshmi";

    public Childs(){
        super(); // Should be written in first line of  constructor
        System.out.println(name + " from Child Constructor");
    
    }
    public void display(){
        System.out.println(name+" :Name from Child display()");
        super.display();
    }

}

public class Supers {
    public static void main(String[] args) {
        Childs c = new Childs();
        c.display();
    }
    
}
