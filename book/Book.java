package com.mycompany.book;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] author;
    private double price;
    private int qty=0;

    public Book(String name, Author[] author, double price)throws Exception {
        this.name = name;
        this.author = author;
        if(price<0){
            throw new Exception("price<0");
        }
        this.price = price;
    }

    public Book(String name, Author[] author, double price, int qty)throws Exception {
        this.name = name;
        this.author = author;
        this.price = price;
        if(qty<0){
            throw new Exception("qty<0");
        }
        this.qty = qty;
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

    public int getQty() {
        return qty;
    }

    public void setQtu(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        String stringBook=new String( "Book " +
                "name=" + name+",authors=");
        String stringAuthors=new String();
        for(int i=0;i<author.length;i++){
            stringAuthors+="{Autor[name="+ author[i].getName()+" ,email="+author[i].getEmail()+" ,gender="+author[i].getGender()+"]"+"}";
        }
        return (stringBook+stringAuthors+" ,price="+price+" ,qty="+qty);
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
