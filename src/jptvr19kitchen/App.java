
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19kitchen;


import tools.savers.HistorySaver;
import entity.History;
import tools.savers.CustomerSaver;
import tools.savers.ProductSaver;
import tools.creators.CreatorCustomer;
import tools.creators.CreatorProduct;
import entity.Product;
import entity.Customer;
import java.util.Scanner;





/**
 *
 * @author pupil
 */
class App {
    private Product[] products = new Product[10];
    private Customer[] customers = new Customer[10];
    private History [] histories = new History[10];
    private ProductSaver productsaver = new ProductSaver();
    private CustomerSaver customersaver = new CustomerSaver();
    private HistorySaver historySaver = new HistorySaver();
    private SaleProduct saleProduct = new SaleProduct();

    
    public App() {
        ProductSaver productSaver = new ProductSaver();
        products = productSaver.loadProducts();
        CustomerSaver customerSaver = new CustomerSaver();
        customers = customerSaver.loadCustomers();

    }
    
    
    public void run(){
        boolean repeat = true;
        System.out.println("--- ������� �������� ������ ---");
        do{
            System.out.println("������: ");
            System.out.println("0. ����� �� ���������");
            System.out.println("1. �������� �����");
            System.out.println("2. ������ �������");
            System.out.println("3. �������� ����������");
            System.out.println("4. ������ �����������");
            System.out.println("5. ������ �����");
            System.out.print("�������� ������: ");
            Scanner scanner = new Scanner(System.in);
            String task = scanner.nextLine();
            switch (task) {
                case "0":
                    System.out.println("--- ����� ��������� :( ---");
                    repeat = false;
                    break;
                case "1":
                    System.out.println("--- �������� ����� ---");
                    CreatorProduct creatorProduct = new CreatorProduct();
                    Product product = creatorProduct.getProduct();
                    for (int i = 0; i < products.length; i++) {
                        if(products[i] == null){
                            products[i] = product;
                            break;
                        }
                    }
                    ProductSaver productSaver = new ProductSaver();
                    productSaver.saveProducts(products);
                    System.out.println("�������� �����: "+product.getProductname());
                    break;
                case "2":
                    System.out.println("--- ������ ������� ---");
                    for (int i = 0; i < products.length; i++) {
                        if(products[i] != null){
                            System.out.println(i+1+". " + products[i].toString());
                        }
                    }
                    break;    
                case "3":
                    System.out.println("--- �������� ���������� ---");
                    CreatorCustomer creatorCustomer = new CreatorCustomer();
                    Customer customer = creatorCustomer.getCustomer();
                    System.out.println("����������� ������ ����������: "
                            +customer.getFirstname()
                            +" "
                            +customer.getLastname()
                    );
                    System.out.println(customer.toString());
                    for (int i = 0; i < customers.length; i++) {
                        if(customers[i] == null){
                            customers[i] = customer;
                            break;
                        }
                    }
                    CustomerSaver customerSaver = new CustomerSaver();
                    customerSaver.saveCustomers(customers);
                    break;   
                case "4":
                    System.out.println("--- ������ ����������� ---");
                    for (int i = 0; i < customers.length; i++) {
                        if(customers[i] != null){
                            System.out.println(i+1+". " + customers[i].toString());
                        }
                    }
                    break;
                case "5":
                    System.out.println("--- ������� ������ ---");
                    History history = saleProduct.takeOnBook(products, customers);
                    saleProduct.addHistoryToArray(history, histories);
                    historySaver.saveHistories(histories);                    
                    break;
                default:
                System.out.println("��� ����� ������.");

                   
            }
        }while(repeat);
    }
}