package io.turntabl;

import io.turntabl.Implementors.CustomerDAOImpl;
import io.turntabl.Implementors.ProductDAOImpl;
import io.turntabl.Implementors.SalesDAOImpl;
import io.turntabl.Transfers.ProductTo;
import io.turntabl.Transfers.SaleTo;

import java.util.List;

public class Main {
    public static void main(String[] args){
        CustomerDAOImpl controller = new CustomerDAOImpl();
        List<ProductTo> response =  controller.getCustomerProducts("Maria Anders");
        System.out.println("List of Customer Products");
        System.out.println(response);

        ProductDAOImpl productDAO = new ProductDAOImpl();
        List<ProductTo> response2 =  productDAO.get5MostPopularProducts();
        System.out.println("List of 5 Most Popular Products");
        System.out.println(response2);

        String startDate = "1996-07-04";
        String endDate = "1996-07-11";
        SalesDAOImpl salesDAO = new SalesDAOImpl();
        List<SaleTo> response3 =  salesDAO.getAllSalesbyWeek(startDate,endDate);
        System.out.println("List All Sales By Week");
        System.out.println(response3);
    }




}
