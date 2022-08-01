import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n,c=1;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number to find its factorial");
        n=s.nextInt();
        for(int i=1;i<=n;i++){
            c=c*i;
        }
        System.out.println(c);
    }
}
