package Packages.classes.B;

import Packages.classes.A.Pencil;

public class Pen {
    public int width;
    public String type;
    public String color;

    public Pen() {
        width = 20;
        type = "BallPoint";
        color = "Red";
        System.out.println("I am called by JVM Automatically during implicit object creation");
    }

    public Pen(int w, String t, String c) {
        this.width = w;
        this.type = t;
        this.color = c;
    }

    public void Write() {
        System.out.println(this.type + " Pen which is " + this.color + " in color is of width " + this.width);
    }

    public String Draw() {
        String s = "This function returns a value";
        return s;
    }

    public static void main(String[] args) {
        // Object with no parameters
        Pen co = new Pen();
        System.out.println(co.color + " " + co.type + " " + co.width + " ");
        co.Write();

        // Object with Parameters
        Pen co1 = new Pen(30, "Ink", "Blue");
        System.out.println(co1.color + " " + co1.type + " " + co1.width + " ");
        co1.Write();

        Pencil p1 = new Pencil();
        Pencil p2 = new Pencil(45, "Firm", "White");
        p1.Write();
        p2.Write();
        System.out.println(p1.color + " " + p1.type + " " + p1.width + " ");
        System.out.println(p2.color + " " + p2.type + " " + p2.width + " ");
    }

    public String Draw(String string) {
        return null;
    }
}