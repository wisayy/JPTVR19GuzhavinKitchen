/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.creators;

import entity.Customer;

/**
 *
 * @author pupil
 */
public class CustomerManager {

    public void printListCustomers(Customer[] customers) {
        for (int i = 0; i < customers.length; i++) {
            if(customers[i] != null){
                System.out.println(i+1+". " + customers[i].toString());
            }
        }
    }
}
