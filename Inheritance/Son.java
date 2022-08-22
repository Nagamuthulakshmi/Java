package Inheritance;
class Grandfather {
    public void happy() {
        System.out.println( "calling calm function of Grandfather class through Son object" );
    }   
}
class Father extends Grandfather {
    public void calm() {
        System.out.println( "calling calm function of Father class through Son object" );
    } 

}
class Son extends Father {
    public static void main( String[ ] args ) { 

        Son Obj = new Son();
        Obj.calm();
        Obj.happy();

    }
}