package com.mycompany.geometric_shapes;

public class Circle {
    private double radius=1.0;
    private String color="red";
    public Circle(){
    }
    public Circle(double radius)throws Exception{
        if(radius<=0){
            throw new Exception("radius<=0!!!");
        }
        this.radius=radius;
    }
    public Circle(double radius, String color) throws Exception {
        if(radius<=0){
            throw new Exception("radius<=0!!!");
        }
        this.radius=radius;
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius)throws Exception {
        if(radius<=0){
            throw new Exception("radius<=0!!!");
        }
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ']';
    }
    public double getArea(){
        return (Math.PI*radius*radius);
    }
}
