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
        System.out.println("--- ���������� �������� ---");
        System.out.print("������� �������� ��������: ");
        product.setProductname(scanner.nextLine());
        System.out.print("������� ���� ��������: ");
        product.setPrice(scanner.nextDouble());
        return product;
    }
    
}