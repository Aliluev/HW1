package com.mycompany;

import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs){
        this.coeffs=new double[coeffs.length];
        for(int i=0;i<coeffs.length;i++){
            this.coeffs[i]=coeffs[i];
        }
    }

    public double[] getCoeffs() {
        return coeffs;
    }

    public int getDegree(){
        return this.coeffs.length-1;
    }

    @Override
    public String toString() {
        StringBuilder slovo=new StringBuilder();
        String str=new String();
      for(int i=coeffs.length-1;i>0;i--){
          //lovo.append(coeffs[i]+)
          str+=coeffs[i]+"x^"+(i)+"+";
      }
      str+=coeffs[0];
      return str;
    }

    public MyPolynomial add(MyPolynomial right){
        double[] array;
        if(right.getCoeffs().length>=this.coeffs.length) {
          //  array=new double[right.getCoeffs().length];
            array=right.getCoeffs();
            for(int i=0;i<this.coeffs.length;i++){
                array[i]+=this.coeffs[i];
            }
            MyPolynomial myPolynomial=new MyPolynomial(array);
            return myPolynomial;
        }else {
            array = this.coeffs;
            for (int i = 0; i < right.getCoeffs().length; i++) {
                array[i] += right.getCoeffs()[i];
            }
            MyPolynomial myPolynomial=new MyPolynomial(array);
            return myPolynomial;
        }
    }


    public MyPolynomial multiply(MyPolynomial right){
        double[] massiv=new double[this.coeffs.length+right.getCoeffs().length-1]; //новый массив большей размерности
        System.out.println(this.toString());
        System.out.println(right.toString());
        for(int i=0;i<this.coeffs.length;i++){
            for(int l=0;l<right.getCoeffs().length;l++){
                massiv[i+l]=massiv[i+l]+((this.coeffs[i])*(right.getCoeffs()[l]));
            }
        }
        MyPolynomial myPolynomial=new MyPolynomial(massiv);
        return myPolynomial;
    }
}
