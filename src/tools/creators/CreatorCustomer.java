/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.creators;

import entity.Customer;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class CreatorCustomer {
    private Random r = new Random();
    private Scanner scanner = new Scanner(System.in);
    public Customer getCustomer() {

        Customer customer = new Customer();
        System.out.println("--- ����������� ������ ���������� ---");
        System.out.print("������� ���: ");
        customer.setFirstname(scanner.nextLine());
        System.out.print("������� �������: ");
        customer.setLastname(scanner.nextLine());
        System.out.print("������� �������: ");
        customer.setPhone(scanner.nextLine());
        customer.setWallet(1000 + (10000 - 1000) * r.nextDouble());
        return customer;
    }
}  
