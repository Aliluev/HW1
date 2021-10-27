package com.mycompany;

public class Rectangle {
    private float length=1.0f;
    private float width=1.0f;
    public Rectangle(){

    }
    public Rectangle(float length,float width)throws Exception{
        if((length<=0)|(width<=0)){
            throw new Exception("(length<=0)|(width<=0)");
        }
        this.length=length;
        this.width=width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length)throws Exception {
        if(length<=0){
            throw new Exception("length<=0");
        }
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width)throws Exception {
        if(width<=0){
            throw new Exception("width<=0");
        }
        this.width = width;
    }
    public double getArea(){
        return (length*width);
    }
    public double getPerimetr(){
        return ((length+width)*2);
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "length=" + length +
                ", width=" + width +
                ']';
    }
}
