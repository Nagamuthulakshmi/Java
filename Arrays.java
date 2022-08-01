import java.util.Scanner;

public class Arrays {
    Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
       Arrays arr = new Arrays();
       arr.staticArrays();
       arr.dynamicArrays();
        
    }
    void staticArrays(){
        int a[]={20,7,1,2,4};
        System.out.println("Printing the Array Elements");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        System.out.println("Finding the Odd and Even Elements");
        for(int i=0;i<a.length;i++){
         if(a[i]>=1){
            if(a[i]%2==0){
                System.out.println("The element "+a[i]+" is Even.");
            }
            else{
                System.out.println("The element "+a[i]+" is Odd.");
            }
         }
         else{
                System.out.println("The element "+a[i]+" not a Positive number");
         }
        }
    }

        void dynamicArrays(){
            System.out.println("Enter the Elements of the Array");
            int[] b=new int[6];
            for(int i=0;i<b.length;i++){
                b[i]=s.nextInt();
            }

            System.out.println("Printing the Array Elements");
            for(int i=0;i<b.length;i++){
                System.out.println(b[i]);
            }
    
            System.out.println("Finding the Odd and Even Elements");
            for(int i=0;i<b.length;i++){
                if(b[i]>=1){
                    if(b[i]%2==0){
                        System.out.println("The element "+b[i]+" is Even.");
                    }
                    else{
                        System.out.println("The element "+b[i]+" is Odd.");
                    }
                 }
                 else{
                        System.out.println("The element "+b[i]+" not a Positive number");
                 }
            }
    }
}
