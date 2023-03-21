public class Operators {
    


public static void main(String[] args) {
    int a=0;
    int b=10;
    System.out.println(a%b);//0
   // System.out.println(b%a);//Exception
    int c=5;
    int d=9;
System.out.println(--c); //4
System.out.println(c); //4
System.out.println(d-- +" kjsfdhji "+ d +" kjsfdhji "+ d-- +" kjsfdhji "+ --d);//9   8    8    6
// Pre increment/decrement will do the operation immediately and stores the same value to the memory
// Post increment/decrement will not do the operation, prints the same value but stores the operated value
//to the memory so that it can be used in next operation.
int num=5;//assign 5 to var num

num += 2; // num=num+2 ->7
System.out.println(num);
num -= 3; // num=num-3 -> 4
System.out.println(num);

num /= 7; //num=num/7 -> 0
System.out.println(num);

num %= 2; //num=num%2 ->0
System.out.println(num);

num *= 3; //num=num*3 ->0
System.out.println(num);


/*
5==5 t
5!=5 f
5>5 f
5<5   f  
5>=5 t
5<=5 t
4==5 F
4!=5 T
4>5 F
4<5 T
4<=5 t
4>=5 f
6==5 f
6<5 f
6>5 t
6>=5 t
6<=5 f
6!=5 t
 */


}

}
