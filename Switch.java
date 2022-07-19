import java.util.Scanner;

public class Switch {
    Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Switch sw = new Switch();
        sw.switchInt();
    }
    void switchInt(){
        System.out.println("Enter any number from 1 to 7 to find the Day of the Week");
        int number = 0;
        number = s.nextInt();
        switch(number){
            case 1: System.out.println("Sunday");
                break;
            case 2: System.out.println("Monday");
                break;
            case 3: System.out.println("Tuesday");
                break;
            case 4: System.out.println("Wednesday");
                break;
            case 5: System.out.println("Thursday");
                break;
            case 6: System.out.println("Friday");
                break;
            case 7: System.out.println("Saturday");
                break;
            default: System.out.println("Invalid Input! Enter numbers from 1 to 7 only");
        }
    }
    void switchString(){

    }
    void switchChar(){

    }
}
