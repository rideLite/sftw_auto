package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("Tagir");

        Square s = new Square(5);

        System.out.println("Плошадь квадрата = " + s.area());


        Rectangle r = new Rectangle(9, 2);
        System.out.println("площадь прямоугольника = " + r.area());
    }

    public static void hello(String somebody) {

        System.out.println("Hello, " + somebody + "!");
    }

}