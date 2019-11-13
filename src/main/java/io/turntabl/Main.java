package io.turntabl;

import java.util.List;

public class Main {
    public static void main(String[] args){
        CustomerDAOImpl controller = new CustomerDAOImpl();

        //List<ProductTo> response =  controller.getCustomerProducts("Maria Anders");
        //System.out.println("List of Customer Products");
        //System.out.println(response);

        //List<ProductTo> response =  controller.get5MostPopularProducts();
        //System.out.println("List of 5 Most Popular Products");
        //System.out.println(response);

        String startDate = "1996-07-04";
        String endDate = "1996-07-11";
        List<SaleTo> response =  controller.getAllSalesbyWeek(startDate,endDate);
        System.out.println("List All Sales By Week");
        System.out.println(response);
    }




}
