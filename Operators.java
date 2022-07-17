public class Operators {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c;
        
        //Preincrement
        c = a++ + b++; // 5 + 6 = 11
        System.out.println(c);//11 as c = 5+6
        System.out.println(a);//6 as a incremented to 6
        System.out.println(b);//7 as b incremented to 7

        //Postincrement
        c = ++a + ++b; // 7 + 8 = 15
        System.out.println(c);//15 as c = 7+8
        System.out.println(a);//7 as a incremented from 6 to 7
        System.out.println(b);//8 as b incremented from 7 to 8

        //Predecrement
        c = a-- + b--; // 7 + 8 = 15
        System.out.println(c);//15 as c = 7+8
        System.out.println(a);//6 as a decremented from 7 to 6
        System.out.println(b);//7 as b decremented from 8 to 7

        //Postdecrement
        c = --a + --b; // 5 + 6
        System.out.println(c);//11 as c = 5+6
        System.out.println(a);//5 as a decremented from 6 to 5
        System.out.println(b);//6 as b decremented from 7 to 6
    }
}
