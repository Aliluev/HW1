package com.mycompany;

import com.mycompany.book.Author;
import com.mycompany.book.Book;
import com.mycompany.complex.MyComplex;

public class Main {
    public static void main(String[] args) throws Exception {

        Author authorNikita=new Author("Nikita","123@email.ru",'m');
        Author authorIvan=new Author("Ivan","456@email.ru",'m');
        Author authorLiza=new Author("Liza","777@email.ru",'w');
        Author[] authors={authorNikita,authorIvan,authorLiza};


        Book book=new Book("fairy tale",authors,200,2);
        System.out.println(book.toString());

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

        MyTriangle myTriangle=new MyTriangle(1,1,2,3,7,2);
        System.out.println(myTriangle.getType());

        MyComplex myComplex1=new MyComplex(2,3);
        MyComplex myComplex2=new MyComplex(3,2);
        MyComplex myComplex3=myComplex1.add(myComplex2);
        System.out.println(myComplex1.getReal());
        System.out.println(myComplex1.getImag());
        System.out.println(myComplex3.getImag());
        System.out.println(myComplex3.getImag());


    }
}
