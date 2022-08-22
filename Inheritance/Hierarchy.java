package Inheritance;

class Siblings{
void share(){
    System.out.println("Calling Share function of Sibling class using Hierarchy object");
}
}
class Brother1 extends Siblings{

}
class Brother2 extends Siblings{

} 
class Hierarchy {
public static void main(String[] args) {
    Brother1 b1 = new Brother1();
    Brother2 b2 = new Brother2();
    b1.share();
    b2.share();
}
}

