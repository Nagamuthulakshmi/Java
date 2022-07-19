import java.util.Scanner;

public class ifConditions {
    Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        ifConditions i = new ifConditions();
        i.simpleIfElse();
        i.ElseifLadder();
        i.NestedIf();
        i.ShortIfelse();
    }
    void simpleIfElse(){
        int age=0;
        System.out.println("Enter the Age of the Person to find if he is eligible to vote");
        age=s.nextInt();
        if(age>=18){
            System.out.println("The Person is Eligible to Vote");
        }
        else{
            System.out.println("The Person is not eligible to vote");
        }
    }
    void ElseifLadder(){
        int number = 0;
        System.out.println("Enter a number to find if its Positive or negative or neutral");
        number=s.nextInt();
        if(number==0){
            System.out.println("The number is neutral");
        }
        else{
            if(number>0){
                System.out.println("The number is Positive");
            }
            else{
                System.out.println("The number is Negative");
            } 
        }
    }
    void NestedIf(){
        float height = 0;
        int percent = 0;

        System.out.println("Enter the height of the person to find if he is eligible to join army");
        height = s.nextFloat();
        System.out.println("Enter the score percent out of 100 without % symbol of the person to find if he is eligible to join army");
        percent = s.nextInt();

        if(height>=160)
        {
            if(percent>=60)
            {
                System.out.println("Congrats! He is Eligible");
            }
            else{
                System.out.println("Sorry, He is not eligible as his percentage is less than 60");
            }
        }
        else{
            if(percent>=60){
                System.out.println("Sorry, He is not eligible as his Height is less than 160");
            }
            else{
                System.out.println("Sorry, He is not eligible as his Height is less than 160 and percent is less than 60");
            }
        }

    }
    void ShortIfelse(){
        float height = 0;
        int percent = 0;

        System.out.println("Enter the height of the person to find if he is eligible to join army");
        height = s.nextFloat();
        System.out.println("Enter the score percent out of 100 without % symbol of the person to find if he is eligible to join army");
        percent = s.nextInt();

        if(height>160 && percent>60){
            System.out.println("Congrats! He is Eligible");
        }
        else{
            if(height<160 || percent<60){
                System.out.println("Sorry, He is not eligible! He should have height greater than 160 and percent greater than 60 to be eligible");
            }
        }
    }

}
