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
public class Customer implements Serializable{
    private String firstname;
    private String lastname;
    private String phone;
    private Double wallet;

    public Customer(String firstname, String lastname, String phone, Double wallet) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
    }

    public Customer(){
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getWallet() {
        return wallet;
    }

    public void setWallet(Double wallet) {
        this.wallet = wallet;
    }


    @Override
    public String toString() {
        return "Customer{" 
                + "firstname=" + firstname 
                + ", lastname=" + lastname 
                + ", phone=" + phone 
                + ", wallet=" + wallet
                + '}';
    }
}