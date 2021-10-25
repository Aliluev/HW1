package com.mycompany;

public class MyTriangle {
    MyPoint v1;
    MyPoint v2;
    MyPoint v3;

    public MyTriangle(int x1,int y1,int x2,int y2,int x3,int y3){
      v1.setXY(x1,y1);
      v2.setXY(x2,y2);
      v3.setXY(x3,y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1.setXY(v1.getX(),v1.getY());
        this.v2.setXY(v2.getX(),v2.getY());
        this.v3.setXY(v3.getX(),v3.getY());
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
    /*
    public String getType(){
       //РЕАЛИЗОВАТЬ СРАВНЕНИЕ DOUBLE
    }

     */

}
