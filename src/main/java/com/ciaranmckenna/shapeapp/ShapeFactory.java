package com.ciaranmckenna.shapeapp;

public class ShapeFactory {

    /*
    * Write a Java program or programs to calculate the volume of:

A sphere
A cube
A regular tetrahedron

Use your program to verify to 2 decimal places that:

A sphere of radius 1 has volume 4.19
A sphere of radius 5 has volume 523.6
A cube of width 1 has volume 1
A cube of width 5 has volume 125
A regular tetrahedron with edge 1 has volume 0.12
A regular tetrahedron with edge 5 has volume 14.73

When coding consider the use of OOP.

    * */
    public static void main(String[] args) {

        Cube cube1 = new Cube("Cube", 1);
        cube1.calculateVolume(cube1.getLength());

        Cube cube2 = new Cube("Cube", 5);
        cube2.calculateVolume(cube2.getLength());

        Sphere sphere1 = new Sphere("Sphere", 1);
        sphere1.calculateVolume(sphere1.getLength());

        Sphere sphere2 = new Sphere("Sphere", 5);
        sphere1.calculateVolume(sphere2.getLength());

        Tetrahedron tetrahedron1 = new Tetrahedron("Tetrahedron", 1);
        tetrahedron1.calculateVolume(tetrahedron1.getLength());

        Tetrahedron tetrahedron2 = new Tetrahedron("Tetrahedron", 5);
        tetrahedron2.calculateVolume(tetrahedron2.getLength());

    }
}
