import java.util.Scanner;

class First{
//Variable - Properties
static int $num_First = 257899342; //int below 9
static char initial = 'E';
static String name = "Naga";
static boolean choice = false;
static double percent = 5.5522253445647;
static float percentage = 99.3f;
static long number = 123456789014l; //more than 9
static short num1 = 3459; // 4 digits

static String names;
static int num2;
static void  read(){
    System.out.println("I am Reading");
}

//Functions - Behavior
//Main doesnot return anything, we can write public static void in any order
//includes only static variable
public static void main(String[] args) {
    int a1 = 7;
    int a=0;
char b=0;
String c=null;
boolean d=false;
double e=0.0;
float f=0.0f;
long l=0;
short n=0;

read();

Scanner s = new Scanner(System.in);
System.out.println("Please Enter your name here:");
names = s.next();//pushpa
System.out.println("The name is"+names);

System.out.println("Please Enter your number here:");
num2 = s.nextInt();//pushpa
System.out.println("The number is"+num2);

    System.out.print("World");//just prints the item - doesnt creat a  new line
    System.out.println("Welcome"); //Create a new line and then prints welcome
   System.out.print(1);
   System.out.print(true);
   System.out.print(4.3);
   System.out.print(4.3f);
   System.out.print('f');
   System.out.println(a+" "+b+" "+ c+" "+ d+" "+ e+" "+ f+" "+ l+" "+ n);
   System.out.println($num_First+"   "+initial+"   "+name+"   "+choice+"   "+percent+"   "+percentage+"   "+number+"  "+num1+"  "+a1) ;
}



}

//Datatype, Variable, literal, Identifier
