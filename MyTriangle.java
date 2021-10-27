package com.mycompany;

public class MyTriangle {
    MyPoint v1=new MyPoint();
    MyPoint v2=new MyPoint();
    MyPoint v3=new MyPoint();

    public MyTriangle(int x1,int y1,int x2,int y2,int x3,int y3){
        v1.setXY(x1,y1);
        v2.setXY(x2,y2);
        v3.setXY(x3,y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1=(" + v1.getX()+"," + v1.getY()+ ")"+
                ", v2=(" + v2.getX()+"," + v2.getY()+ ")"+
                ", v3=(" + v3.getX()+"," + v3.getY()+ ")"+
                ']';
    }

    public double getPerimetr(){
        double perimetr=v1.distance(v2);
        perimetr+=v2.distance(v3);
        perimetr+=v3.distance(v1);
        return perimetr;
    }

    // Equilateral-равносторонний
    // Isosceles-равнобедренный
    // Scalene-неравнасторонний

    public String getType() {
        final double threshold = 0.0001;
        double length1 = v1.distance(v2);
        double length2 = v2.distance(v3);
        double length3 = v3.distance(v1);
        if ((Math.abs(length1 - length2) < threshold) && (Math.abs(length2 - length3) < threshold)) {
            return "Equilateral";
        } else if ((Math.abs(length1 - length2) < threshold) | (Math.abs(length2 - length3) < threshold) | (Math.abs(length3 - length1) < threshold)) {
            return "Isosceles";
        }else return "Scalene";
    }



}
