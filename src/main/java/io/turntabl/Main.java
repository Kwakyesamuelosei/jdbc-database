package io.turntabl;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //getAllCustomers();

        while (true){
            System.out.println();
            System.out.println("Enter customer name: \n");
            Scanner input = new Scanner(System.in);
            String name = input.nextLine();
            System.out.println();
            getCustomerByName(name);
        }
    }

    public static void getCustomerByName(String name){
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql:northwind";

            try{
                Connection db = DriverManager.getConnection(url,"samuel-kwakye","turntabl");
                Statement s = db.createStatement();
                ResultSet rs = s.executeQuery("select * from customers where contact_name like '" + name + "%'");
                printFormat(rs);
            }catch (SQLException sqle){
                System.out.println("Connection err: " + sqle);
            }

        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void printFormat(ResultSet rs) throws SQLException {
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.printf("%30s %20s %25s %25s", "Contact Title", "Contact Name", "Phone", "Address");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------------");
        if(rs.next() == false){
            System.out.format("%30s %30s",
                    "","Record Not Found");
            System.out.println();
        }else{
            do{
                System.out.format("%30s %20s %25s %25s",
                        rs.getString("contact_title"),rs.getString("contact_name"),rs.getString("phone"),rs.getString("address"));
                System.out.println();
            }while(rs.next());
        }
    }

    public static void getAllCustomers(){
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql:northwind";

            try{
                Connection db = DriverManager.getConnection(url,"samuel-kwakye","turntabl");
                Statement s = db.createStatement();
                ResultSet rs = s.executeQuery("select * from customers");
                printFormat(rs);
            }catch (SQLException sqle){
                System.out.println("Connection err: " + sqle);
            }

        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
