import java.util.Scanner;

public class calc {
   static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        calc c1 =  new calc();
        c1.add();// Function without return without parameter

        System.out.println(c1.sub());// Function with return type without parameter

        int a = s.nextInt();
        int b = s.nextInt(); 
        System.out.println(c1.mul(a,b));  // Function with return type with parameter

        int c = s.nextInt();
        int d = s.nextInt();
        c1.div(c,d); // Function without return type with parameter
    }
    void add(){
        int a = s.nextInt();
        int b = s.nextInt();
        int c = a+b;
        System.out.println(c);
    }

    int sub(){
        int a = s.nextInt();
        int b = s.nextInt();
        int c = a-b;
        return c;
    }

    int mul(int a1,int b1){
        int c1 = a1*b1;
        return c1;
    }

    void div(int c1, int c2){
        int res = c1/c2;
        System.out.println(res);
    }

}
