/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author pupil
 */
public class History implements Serializable{
    private Customer customer;
    private Product product;
    private Date giveOutDate;
    
    public History() {
    }

    public History(Customer customer, Product product, Date giveOutDate) {
        this.customer = customer;
        this.product = product;
        this.giveOutDate = giveOutDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getGiveOutDate() {
        return giveOutDate;
    }

    public void setGiveOutDate(Date giveOutDate) {
        this.giveOutDate = giveOutDate;
    }

    @Override
    public String toString() {
        return "History{" 
                + "customer=" + customer 
                + ", product=" + product 
                + ", giveOutDate=" + giveOutDate 
                + '}';
    }
}
    
     