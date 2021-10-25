package com.mycompany.book;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] author;
    private double price;
    private int qtu=0;

    public Book(String name, Author[] author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author[] author, double price, int qtu) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtu = qtu;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtu() {
        return qtu;
    }

    public void setQtu(int qtu) {
        this.qtu = qtu;
    }

    @Override
    public String toString() {
        String stringBook=new String( "Book " +
                "name=" + name+",authors=");
        String stringAuthors=new String();
        for(int i=0;i<author.length;i++){
            stringAuthors+="{Autor[name="+ author[i].getName()+" ,email="+author[i].getEmail()+" ,gender="+author[i].getGender()+"]"+"}";
        }
        return (stringBook+stringAuthors+" ,price="+price+" ,qty="+qtu);
    }

    public String getAuthorNames(){
      String authorNames=new String();
      for(int i=0;i<author.length;i++)
          if(i!=author.length-1) {
              authorNames += author[i].getName() + ",";
          }else {
              authorNames += author[i].getName();
          }
      return authorNames;
    }


}
