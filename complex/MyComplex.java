package com.mycompany.complex;

public class MyComplex {
    private double real=0.0;
    private double imag=0.0;

    public MyComplex(){

    }

    public MyComplex(double real,double imag){
        this.real=real;
        this.imag=imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real,double imag){
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        if(imag>=0) {
            return ("(" + real + "+" + imag + "i)");
        }else return ("(" + real + imag + "i)");
    }

    public boolean isReal(){
        if(real==0){
            return false;
        }else return true;
    }

    public boolean isImaginary(){
        if(imag==0){
            return false;
        }else return true;
    }


    public boolean equals(double real,double imag) {
        final double threshold = 0.0001;
        if((Math.abs(this.real-real)<threshold)&&(Math.abs(this.imag-imag)<threshold)){
            return true;
        }else return false;
    }


    public boolean equals(MyComplex another){
        return (another.equals(this.real,this.imag));
    }

    //Модуль комплексного числа
    public double magnitude(){
        return (Math.sqrt(Math.pow(real,2)+Math.pow(imag,2)));
    }

    public double argument(){
       return (Math.atan(imag/real));
    }

    public MyComplex add(MyComplex right){
        this.real+=right.getReal();
        this.imag+=right.getImag();
        return this;
    }
    public MyComplex addNew(MyComplex right){
        MyComplex myComplex=new MyComplex();
        myComplex.setReal(this.real+right.getReal());
        myComplex.setImag(this.imag+right.getImag());
        return myComplex;
    }
    public MyComplex subtract(MyComplex right){
        this.real-=right.getReal();
        this.imag-=right.getImag();
        return this;
    }
    public MyComplex subtractNew(MyComplex right) {
        MyComplex myComplex = new MyComplex();
        myComplex.setReal(this.real - right.getReal());
        myComplex.setImag(this.imag - right.getImag());
        return myComplex;
    }

    public MyComplex multiply(MyComplex right){
        double real_copy=0;//для того чтобы не изменять в runtime real
        real_copy=(this.real*right.getReal())-(this.imag*right.imag);
        this.imag=((this.real*right.imag)+(right.real*this.imag));
        this.real=real_copy;
        return this;
    }

    public MyComplex divide(MyComplex right){
        double real_copy=0;//для того чтобы не изменять в runtime real
        real_copy=((this.real*right.getReal())+(this.imag*right.imag))/(right.imag*right.imag+right.real+right.real);
        this.imag=((this.imag*right.real)-(this.real*right.imag))/(right.imag*right.imag+right.real+right.real);
        this.real=real_copy;
        return this;
    }

    public MyComplex conjugate(){
        MyComplex myComplex=new MyComplex(this.real,this.imag*(-1));
        return myComplex;
    }

}
