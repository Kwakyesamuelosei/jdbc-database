package io.turntabl;

import java.sql.*;

public class Controller {

    public Controller() {
    }

    /**
     *Function to search customers by name
     * @param: String name
     * @return void - no return
    */
    public void getCustomerByName(String name){
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql:northwind";

            try{
                Connection db_con = DriverManager.getConnection(url,"samuel-kwakye","turntabl");
                PreparedStatement query = db_con.prepareStatement("select * from customers where contact_name like ?");
                query.clearParameters();
                query.setString(1,name + "%");
                ResultSet rs = query.executeQuery();
                printFormat(rs);
            }catch (SQLException sqle){
                System.out.println("Connection err: " + sqle);
            }

        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

     /**
     *Function to print Result set
     * @param: String name
     * @return void - no return
     */
    public void printFormat(ResultSet rs) throws SQLException {
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.printf("%25s %20s %25s %25s", "Contact Title", "Contact Name", "Phone", "Address");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------------");
        if(rs.next() == false){
            System.out.format("%30s %30s",
                    "","No Record Found");
            System.out.println();
        }else{
            do{
                System.out.format("%25s %20s %25s %25s",
                        rs.getString("contact_title"),rs.getString("contact_name"),rs.getString("phone"),rs.getString("address"));
                System.out.println();
            }while(rs.next());
        }
    }

     /**
     *Function to view all Customers
     * @param: String name
     * @return void - no return
     */
    public void getAllCustomers(){
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql:northwind";

            try{
                Connection db_con = DriverManager.getConnection(url,"samuel-kwakye","turntabl");
                PreparedStatement query = db_con.prepareStatement("select * from customers");
                ResultSet rs = query.executeQuery();
                printFormat(rs);
            }catch (SQLException sqle){
                System.out.println("Connection err: " + sqle);
            }

        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
