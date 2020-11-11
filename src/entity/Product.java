/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author pupil
 */
public class Product implements Serializable{

//
    private String productname;
    private Double price;

     public Product() {
    }

    public Product(String productname, Double price, String name, int inStock) {
        this.productname = productname;
        this.price = price;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
     
    @Override
    public String toString() {
        return "Product{" 
                + "productname=" + productname 
                + ", price=" + price 
                + '}';
    }
}


