class Day1{
    public static void main(String args[]){
        int a=5;
        int d=0;
        //Printing simple data
        System.out.println(a);
        //Creating object of a class
        Day1 day1Obj = new Day1();
        //Calling void functions using created object
        day1Obj.Addition();
        //Calling int funtion using created object and passing the returned value to d variable
        d = day1Obj.Subtraction();
        System.out.println("Value of c inside the Subtraction Function:"+d);
    }
    void Addition(){ //Void fuctions doesnt have return at the end of the function
        int a=6;
        int b=5;
        int c;
        c=a+b;
        System.out.println("Value of c inside the Addition Function:"+c);
    }
    int Subtraction(){//Int functions returns an integer c to the function call(to Line 14)
        int a= 5;
        int b= 15;
        int c;
        c=b-a;
        return c;
    }
}