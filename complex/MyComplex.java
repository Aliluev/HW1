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
        return ("("+real+" "+imag+"i)");
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


    //ПРОВЕРИТЬ!!!!
    public boolean equals(MyComplex another){
        return (another.equals(this.real,this.imag));
    }

    //Модуль комплексного числа
    public double magnitude(){
        return (Math.sqrt(Math.pow(real,2)+Math.pow(imag,2)));
    }

    //ПОСМОТРЕТЬ УГОЛ!!!!
    public double argument(){
       return (Math.atan(imag/real));
    }
    //Меняется ли состояние this объекта???
    public MyComplex add(MyComplex right){
        MyComplex myComplex=new MyComplex();
        myComplex.setReal(this.real+right.getReal());
        myComplex.setImag(this.imag+right.getImag());
        return myComplex;
    }
}
