package com.classes.A;

import com.classes.B.Pen;

public class Pencil {
    public int width;
    public String type;
    public String color;
    public Pencil(){
        width = 20;
        type = "Color Pencils";
        color = "Grey";
        System.out.println("I am called by JVM Automatically during implicit object creation");
    }
    public Pencil(int w,String t, String c){
        this.width = w;
        this.type = t;
        this.color = c;
    }
    public void Write(){
        System.out.println(this.type+" Pen which is "+this.color+" in color is of width "+this.width);
    }

    public String Draw(){
        String s = "This function returns a value";
        return s;
    }

    public String Draw(String a){
        return a;
    }
    public static void main(String[] args) {
        String s1;
        //Object with no parameters
        Pencil co = new Pencil();
        System.out.println(co.color+" "+co.type+" "+co.width+" ");
        co.Write();
        s1=co.Draw();

        //Object with Parameters
        Pencil co1 = new Pencil(30, "HB", "Black");
        System.out.println(co1.color+" "+co1.type+" "+co1.width+" ");
        co1.Write();

        Pen p1 = new Pen();
        Pen p2 = new Pen(45, "Firm","White");
        p1.Write();
        p2.Write();
        s1=p2.Draw("This function returns a value");

        System.out.println(p1.color+" "+p1.type+" "+p1.width+" ");
        System.out.println(p2.color+" "+p2.type+" "+p2.width+" ");
    }
}
