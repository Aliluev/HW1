package com.mycompany.ball;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x,float y,int radius,int speed,int direction)throws Exception{
        this.x=x;
        this.y=y;
        if(radius<0){
            throw new Exception("radius<0!!!");
        }
        if(direction>180|direction<-180){
            throw new Exception("Неверные данные direction");
        }
        this.radius=radius;
        xDelta=(float)(speed*Math.cos(Math.toRadians(direction)));//переводим direction в радианы и вычисляю дельта
        yDelta=(float)(-speed*Math.sin(Math.toRadians(direction)));
      //  System.out.println(Math.sin(Math.PI/6));
     //   System.out.println("yDelta="+yDelta);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move(){
        x+=xDelta;
        y+=yDelta;
    }

    public void reflectHorizontal(){
        xDelta*=-1.0f;
    }
    public void reflectVertical(){
        yDelta*=-1.0f;
    }

    @Override
    public String toString() {
        return "Ball[("+x+","+y+"), radius="+radius+", speed=("+xDelta+","+yDelta+")]";
    }
}
