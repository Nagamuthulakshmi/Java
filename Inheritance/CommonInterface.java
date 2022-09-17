package Inheritance;

//They are used to achieve multiple inheritance and polymorphism.
/*All the variables inside Interface are public , static and final even if we don’t specify anything.

All methods are public and abstract even if we don’t specify anything.

Also we can’t change these default access modifiers. */

interface Hello{
       /*Since all variables inside interface are static, we can access it directly using interface name. And these variables are public, we can access it anywhere in the application.
Also these variables are final, so we can’t modify them.*/
    
    String str = "hello";
 
/*Since all the methods inside interface are abstract, they must be overridden in the implementing class.

And since methods are public, they must be accessible anywhere in the application using object of subclass.

Why can’t we access methods using interface name ?

They are not static methods, so we need object to access them. */
void sayHello();
    }

class CommonInterface implements Hello{

    public void sayHello(){
        System.out.println("Hello");
         }
 public static void main(String[] args) {
    
    Hello hello = new CommonInterface();//upcasting
 
    hello.sayHello();
 }
        
         
         
}