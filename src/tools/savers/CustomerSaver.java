/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.savers;

import entity.Customer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author pupil
 */
public class CustomerSaver {
    
    public void saveCustomers(Customer[] Customer) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("customers");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(Customer);
            oos.flush();
        } catch (FileNotFoundException ex) {
            System.out.println("�� ������ ����");
        } catch (IOException ex) {
            System.out.println("������ �����/������");
        }
    }

    public Customer[] loadCustomers() {
        Customer[] customers = new Customer[10];
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("customers");
            ois = new ObjectInputStream(fis);
            customers = (Customer[]) ois.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println("�� ������ ����");
        } catch (IOException ex) {
            System.out.println("������ �����/������");
        } catch (ClassNotFoundException ex) {
            System.out.println("�� ������ �����");
        }
        return customers;
    }
}
