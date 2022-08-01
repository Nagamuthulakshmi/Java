import java.util.Scanner;

public class Loops{
Scanner s = new Scanner(System.in);
public static void main(String[] args) {
    Loops l = new Loops();
    System.out.println("Enter the value to print Multiplication Tables using For Loop");
    l.forLoop();
    System.out.println("Enter the value to print Multiplication Tables using While Loop");
    l.whileLoop();
    System.out.println("Enter the value to print Multiplication Tables using doWhile Loop");
    l.doWhileLoop();
    
}

void forLoop(){

  int b=s.nextInt();
  int c;
  System.out.println("Simple Loop for 5 Iterations");
    for ( int i = 0 ; i < 5 ; i ++ ) {
      System.out.println("For Loop 5 Times");
  }

  System.out.println("Print Star Patterns");
  for ( int i = 1 ; i <= 5 ; i ++ ) {
      for ( int j = 1 ; j <= i ; j++) {
            System.out.print( "*" );
      } 
    System.out.println(); 
  }

  System.out.println("Print Multiplication Tables");
  for(int i=1;i<=12;i++){
    c=i*b;
    System.out.println(i+"X"+b+"="+c);
  }
}

void whileLoop(){
int num = 1,b1,c1,i=1;
b1=s.nextInt();
System.out.println("Print Multiples of 10 between 1-100");
while ( num < 100 ) {
      System.out.println (num%10);
      num = num + 10;
}

System.out.println("Print Multiplication Tables");
  while(i<=12){
    c1=i*b1;
    System.out.println(i+"X"+b1+"="+c1);
    i++;
  }

}

void doWhileLoop(){
  int num1 = 1,b2,c2,i=1;
  b2=s.nextInt();
  System.out.println("Print Multiples of 10 between 1-100");
  do{
        System.out.println (num1%10);
        num1 = num1 + 10;
  }while(num1 < 100);
  
  System.out.println("Print Multiplication Tables");
    do{
      c2=i*b2;
      System.out.println(i+"X"+b2+"="+c2);
      i++;
    } while(i<=12);
}


}
