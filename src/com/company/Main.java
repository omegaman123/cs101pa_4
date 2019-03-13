package com.company;

public class Main {

    public static void main(String[] args) {

        Vector v = new Vector(3,4);
        v.print();
        v = new Vector(25,65);
        v.print();

        Vector b =  v.add(v);
        b.print();
        b = b.normalize();
        b.print();

        Vector a = new Vector(2,3);
        Vector c = new Vector(4,1);
        float sc = a.scalarProject(c);
        System.out.println(sc);

        v = a.vectorProject(c);
        v.print();

    }
}
