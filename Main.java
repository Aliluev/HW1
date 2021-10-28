package com.mycompany;

import com.mycompany.ball.Ball;
import com.mycompany.ball.Container;
import com.mycompany.book.Author;
import com.mycompany.book.Book;
import com.mycompany.complex.MyComplex;
import com.mycompany.employee.Employee;
import com.mycompany.geometric_shapes.Circle;
import com.mycompany.geometric_shapes.MyPoint;
import com.mycompany.geometric_shapes.MyTriangle;
import com.mycompany.geometric_shapes.Rectangle;
import com.mycompany.polynomial.MyPolynomial;

public class Main {
    public static void main(String[] args) throws Exception {

//---------------------------Circle-------------------------------------------
        System.out.println("---Circle---");
        Circle example1=new Circle(2,"yellow");
        System.out.println("toString="+example1.toString());
        System.out.println("getArea="+ example1.getArea());
//---------------------------Rectangle-------------------------------------------
        System.out.println("---Rectangle---");
        Rectangle rectangle=new Rectangle(2,3);
        System.out.println("toString="+rectangle.toString());
        System.out.println("getArea="+rectangle.getArea());
        System.out.println("getPerimetr="+rectangle.getPerimetr());
//---------------------------Employee-------------------------------------------
        System.out.println("---Employee---");
        Employee employee=new Employee(10,"Petrov", "Pavel", 20000);
        System.out.println(employee.toString());
        System.out.println("getAnnualSalary="+employee.getAnnualSalary());
        System.out.println("raiseSalary10%="+employee.raiseSalary(10));
//---------------------------Book-------------------------------------------
        //----------Author----------
        Author authorNikita=new Author("Nikita","123@email.ru",'m');
        Author authorIvan=new Author("Ivan","456@email.ru",'m');
        Author authorLiza=new Author("Liza","777@email.ru",'w');
        Author[] authors={authorNikita,authorIvan,authorLiza};

        System.out.println("---Book---");
        Book book=new Book("fairy tale",authors,200,2);
        System.out.println("getAuthorNames="+book.getAuthorNames());
        System.out.println("toString="+book.toString());
//---------------------------MyPoint-------------------------------------------
        System.out.println("---MyPoint---");
        MyPoint myPoint=new MyPoint(2,2);
        System.out.println("toStringFirst="+myPoint.toString());
        MyPoint secondMypoint=new MyPoint(5,2);
        System.out.println("toStringSecond="+secondMypoint.toString());
        System.out.println("distanceFirstSecond="+myPoint.distance(secondMypoint));
//---------------------------Triangle-------------------------------------------
        System.out.println("---Triangle---");
        MyTriangle myTriangle=new MyTriangle(1,1,2,3,3,1);
        System.out.println("toString="+myTriangle.toString());
        System.out.println("getType="+myTriangle.getType());

        MyTriangle myTriangle2=new MyTriangle(1,1,2,3,4,1);
        System.out.println("toString="+myTriangle2.toString());
        System.out.println("getType="+myTriangle2.getType());
//---------------------------MyComplex-------------------------------------------
        System.out.println("---MyComplex---");
        MyComplex myComplex1=new MyComplex(2,3);
        System.out.println("toString1="+myComplex1.toString());
        MyComplex myComplex2=new MyComplex(3,2);
        System.out.println("toString2="+myComplex2.toString());
        System.out.println("add="+myComplex1.add(myComplex2).toString());

        MyComplex myComplex3=new MyComplex(3,2);
        System.out.println("toString3="+myComplex3.toString());
        System.out.println("equals_myComplex3_myComplex2="+myComplex3.equals(myComplex2));
//---------------------------MyPolynomial-------------------------------------------
        System.out.println("---MyPolynomial---");
         double[] array={1,2,3,4,5,6};
         double[] array2={2,3,4,5,6};

        MyPolynomial myPolynomial=new MyPolynomial(array);
        System.out.println("toString="+myPolynomial.toString());
        MyPolynomial myPolynomial2=new MyPolynomial(array2);
        System.out.println("toString="+myPolynomial2.toString());

        MyPolynomial myPolynomial13=myPolynomial.add(myPolynomial2);
        System.out.println("add="+myPolynomial13.toString());

        double[] array3={1,2};
        double[] array4={1,2,1};

        MyPolynomial myPolynomial3=new MyPolynomial(array3);
        MyPolynomial myPolynomial4=new MyPolynomial(array4);
        System.out.println("toString3="+myPolynomial3.toString());
        System.out.println("toString4="+myPolynomial4.toString());

        MyPolynomial myPolynomial5=myPolynomial3.multiply(myPolynomial4);
        System.out.println("multiply="+myPolynomial5.toString());
        //---------------------------Ball-------------------------------------------
        System.out.println("---Ball---");
        Ball ball=new Ball(3,3,1,1,-30);
        System.out.println("toStringBall="+ball.toString());
        Container container=new Container(0,0,5,5);
        System.out.println("toStringContainer="+container.toString());

        System.out.println("Есть шар в нашем контейнере? "+container.collides(ball));
        System.out.println("ball.move");
        ball.move();
        System.out.println("toStringBall="+ball.toString());
        System.out.println("Есть шар в нашем контейнере? "+container.collides(ball));
        System.out.println("ball.move");
        ball.move();
        System.out.println("toStringBall="+ball.toString());
        System.out.println("Есть шар в нашем контейнере? "+container.collides(ball));

    }
}
