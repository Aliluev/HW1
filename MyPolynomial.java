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
          str+=coeffs[i]+"x^"+(coeffs.length-1);
      }
      str+=coeffs[0];
      return str;
    }

    public MyPolynomial add(MyPolynomial right){
        double[] array;
        if(right.getCoeffs().length>=this.coeffs.length) {
            array=new double[right.getCoeffs().length];
        }else {
            array = new double[this.coeffs.length];
        }
        for(int i=0;i<right.getCoeffs().length;i++){
            array[i]=this.coeffs[i]+right.getCoeffs()[i];
        }
        MyPolynomial myPolynomial=new MyPolynomial(array);
        return myPolynomial;
    }


}
