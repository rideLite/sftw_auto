package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("Tagir");

        double len = 5.0;
        System.out.println("Плошадь= " + area(len));

        double a = 3;
        double b = 2;
        System.out.println("площадь прямоугольника = " + area(a, b));
    }

    public static void hello(String somebody) {

        System.out.println("Hello, " + somebody + "!");
    }

    public static double area(double length) {
        return length * length;
    }

    public static double area(double a, double b) {
        return a * b;
    }

}