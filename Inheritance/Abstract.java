package Inheritance;

abstract class Message {
    // cant create object for abstract classes, cant be public as its public on own
    //1) If a class has any one method declared as abstract, then that class must be defined as abstract class


    Message(){
        System.out.println("Hi from Abstract Constructor");
    }
    
    abstract void send();
    abstract void recieve();

    public void display(){
        System.out.println("Hi from display method of Abstract class");
    }
}
class Communicate extends Message{
// a class extending an abstract class should have the abstract method implementation
    void send() {
        System.out.println("Sending Messages");
        
    }

    void recieve() {
        System.out.println("Recieve Messages");
        
    }
    
}
class Abstract{
public static void main(String[] args) {
    /*Anyone who needs to access this functionality has to call the method using the Phone object pointing to its subclass. */
    Message m = new Communicate();
    m.send();
    m.recieve(); 
    m.display();
}
}


