import java.util.*;

class Repeat {
    public static void main(String[] args) {
        String str = "Hello Hello";
        Scanner sc = new Scanner(System.in);
        int count = 0;
        char c = sc.next().charAt(0);
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i] == c){
                count++;
            }
        }
        System.out.println("The letter is repeated " +count+" times");
    }
}
