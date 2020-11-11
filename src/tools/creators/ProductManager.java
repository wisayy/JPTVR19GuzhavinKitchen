/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.creators;

import entity.Product;

/**
 *
 * @author pupil
 */
public class ProductManager {

    public void printListComputer(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            if(products[i] != null){
                System.out.println(i+1+". " + products[i].toString());
            }
        }
    }
}
