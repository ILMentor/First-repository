package com.company;

public abstract class Figure {


    abstract double area();

    abstract double perimeter();


}
class Triangle extends Figure{
    double a, b, c;
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Triangle() {

    }

    @Override
    double area() {
        return a * b / 2;
    }

    @Override
    double perimeter() {
        return a + b + c;
    }
}

/*Практика с абстрактными классами.
        Абстрактные классы = заготовки.
        Для одного объекта много действий.
        Triangle tr = new Triangle(3, 4, 5);
        Triangle tri = new Triangle(3, 8);
        System.out.println(tr.area());
        System.out.println(tri.area());
        System.out.println(tr.perimeter());
        System.out.println(tri.perimeter());
        */