package Inheritance;

/*Reason is very simple, when a class implements ‘n’ interfaces and if all ‘n’ interfaces has same method with same signature also, for an implementer class
There will be no ambiguity as class has to provide the definition forcefully. */

    interface A{
 
    void show();
     
    }
     
    interface B{
     
    void print();
     
    }
     
    class Intrfac implements A,B{
     
    public void show(){
    System.out.println("show");
    }
     
    public void print(){
    System.out.println("print");
    }
    
    public static void main(String[] args) {
        Intrfac c = new Intrfac();
        c.show();
        c.print();
    }
     
    }
