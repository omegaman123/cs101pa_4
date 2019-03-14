package com.company;




public class Main {

    static void TestAdd(float x1, float y1, float x2, float y2){
        Vector v1 = new Vector(x1,y1);
        Vector v2 = new Vector(x2,y2);
        Vector v3 = v1.add(v2);
        System.out.printf("(%f, %f) + (%f, %f) = (%f, %f) with magnitude: %f, and angle: %f\n",
                x1,y1,x2,y2,v3.getX(),v3.getY(),v3.getMagnitude(),v3.getAngle());
    }

    static void TestSubtract(float x1, float y1, float x2, float y2){
        Vector v1 = new Vector(x1,y1);
        Vector v2 = new Vector(x2,y2);
        Vector v3 = v1.subtract(v2);
        System.out.printf("(%f, %f) - (%f, %f) = (%f, %f) with magnitude: %f, and angle: %f\n",
                x1,y1,x2,y2,v3.getX(),v3.getY(),v3.getMagnitude(),v3.getAngle());

    }

    static void TestProjection(float x1, float y1, float x2, float y2){
        Vector v1 = new Vector(x1,y1);
        Vector v2 = new Vector(x2,y2);
        float sc = v1.scalarProject(v2);
        Vector v3 = v1.vectorProject(v2);
        System.out.printf("Vector (%f, %f) projected onto (%f, %f)\nyields scalar %f, vector (%f, %f), " +
                        "magnitude: %f, angle: %f\n"
        ,x1,y2,x2,y2,sc,v3.getX(),v3.getY(),v3.getMagnitude(),v3.getAngle());

    }
    static void TestDotProduct(float x1, float y1, float x2, float y2){
        Vector v1 = new Vector(x1,y1);
        Vector v2 = new Vector(x2,y2);
        float dot = v1.dotProduct(v2);
        System.out.printf("(%f, %f) • (%f, %f) = %f\n",
                x1,y1,x2,y2,dot);
    }

    static void TestScalarMultiply(float x1, float y1, float scalar){
        Vector v1 = new Vector(x1,y1);
        v1 = v1.scalarMultiply(scalar);
        System.out.printf("(%f, %f) * %f = (%f, %f)\n",x1,y1,scalar,v1.getX(),v1.getY());
    }

    public static void main(String[] args) {

        System.out.println("Testing adds for vectors");
        TestAdd(3,4,-3,4);
        TestAdd(3,4,3,4);
        TestAdd(10,20,40,50);
        System.out.printf("\nTesting subtract for vectors\n");
        TestSubtract(3,4,-3,-4);
        TestSubtract(3,4,3,4);
        TestSubtract(10,20,40,50);

        System.out.println("\nTesting print out, angle, and magnitude for constructor");
        Vector v = new Vector(12,14);
        v.print();
        v = new Vector(25,65);
        v.print();
        v = v.normalize();
        v.print();
        v = new Vector(-3, 4);
        v.print();
        v = new Vector(-3, 4);
        v.print();
        v = new Vector(3, -4);
        v.print();
        v = new Vector(-3, -4);
        v.print();

        System.out.println("\nTesting dot product for vectors");
        TestDotProduct(1,2,5,6);
        TestDotProduct(3,4,5,6);
        TestDotProduct(-4,4,5,-5);
        TestDotProduct(-16,-3,-34,-100);

        System.out.println("\nTesting scalar and vector projection functions.");
        TestProjection(2,3,4,1);
        TestProjection(4,1,2,3);

        System.out.println("\nTesting scalar multiplication of vectors.");
        TestScalarMultiply(3,4,2);
        TestScalarMultiply(10,20,4);

    }
}

