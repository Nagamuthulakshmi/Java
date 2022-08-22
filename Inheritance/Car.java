package Inheritance;
class Vehicle {
    String brand = "BMW";
    public void start() {
        System.out.println( "calling start function of SingleInheritance class via Car's Object" );
    }   
}
class Car extends Vehicle {
    public static void main( String[ ] args ) { 

        Car Obj = new Car();
        System.out.println( Obj.brand );
        Obj.start();
    }
}



     


