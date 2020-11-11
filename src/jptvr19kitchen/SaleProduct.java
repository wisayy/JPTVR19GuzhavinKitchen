/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19kitchen;

import tools.creators.CustomerManager;
import tools.creators.ProductManager;
import entity.History;
import entity.Customer;
import entity.Product;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author pupil
 */

public class SaleProduct {
    private Scanner scanner = new Scanner(System.in);
    private CustomerManager customerManager = new CustomerManager();
    private ProductManager productManager = new ProductManager();
   
    public History takeOnBook(Product[] products, Customer[] customers) {
        History history = new History();
        Customer customer = new Customer();
        System.out.println("--- Список покупателя ---");
            customerManager.printListCustomers(customers);
            System.out.print("Выберите номер Покупателя: ");
            int customerNumber = scanner.nextInt();
            scanner.nextLine();
            customer = customers[customerNumber-1];
            history.setCustomer(customer);
            productManager.printListComputer(products);
            System.out.print("Выберите номер кухонной мебели: ");
            int productNumber = scanner.nextInt();
            scanner.nextLine();
            Product product = products[productNumber-1];
            history.setProduct(product);
            Calendar calendar = new GregorianCalendar();
            history.setGiveOutDate(calendar.getTime());
            customer.setWallet(customer.getWallet() - product.getPrice());
            this.printHistory(history);
            return history;
}
    public void addHistoryToArray(History history, History[] histories) {
        for (int i = 0; i < histories.length; i++) {
            if (histories[i] == null) {
                histories[i] = history;
                break;
            }
        }
    }
    private void printHistory(History history) {
        System.out.printf("Кухонная мебель \"%s\" продана %s %s%n"
                ,history.getProduct().getProductname()
                ,history.getCustomer().getFirstname()
                ,history.getCustomer().getLastname()
        );
    }
       
         public void printListGivenComp(History[] histories) {  
             for (int i = 0; i < histories.length; i++) {
                 if(histories[i] != null)
            System.out.printf("%d. Кухонная мебель \"%s\" продана %s %s%n"
                   ,i+1
                   ,histories[i].getProduct().getProductname()
                   ,histories[i].getCustomer().getFirstname()
                   ,histories[i].getCustomer().getLastname()
            );
    }
}
}