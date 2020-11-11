/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.creators;

import entity.Product;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class CreatorProduct {
        private Scanner scanner = new Scanner(System.in);
        public Product getProduct() {
        Product product = new Product();
        System.out.println("--- Добавление продукта ---");
        System.out.print("Введите название продукта: ");
        product.setProductname(scanner.nextLine());
        System.out.print("Введите цену продукта: ");
        product.setPrice(scanner.nextDouble());
        return product;
    }
    
}