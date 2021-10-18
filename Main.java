package com.mycompany;

public class Main {
    public static void main(String[] args) {
        Circle example1=new Circle(2,"yellow");
        System.out.println(example1.toString());
        System.out.println(example1.getArea());

        Rectangle rectangle=new Rectangle(2,3);
        System.out.println(rectangle.toString());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimetr());

    }
}
