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

        Employee employee=new Employee(10,"Petrov", "Pavel", 20000);
        System.out.println(employee);

        MyPoint myPoint=new MyPoint(2,2);
        MyPoint secondMypoint=new MyPoint(5,3);
        System.out.println(myPoint.distance(secondMypoint));
    }
}
