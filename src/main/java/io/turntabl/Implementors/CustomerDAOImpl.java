package io.turntabl.Implementors;

import io.turntabl.DAO.CustomerDAO;
import io.turntabl.Transfers.ProductTo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {
    List<ProductTo> productTos = new ArrayList<>();

    @Override
    public List<ProductTo> getCustomerProducts(String name) {

        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql:northwind";

            try{
                Connection db_con = DriverManager.getConnection(url,"samuel-kwakye","turntabl");
                PreparedStatement query = db_con.prepareStatement(
                        "select products.product_name,products.unit_price from products inner join order_details on products.product_id = order_details.product_id inner join orders on order_details.order_id = orders.order_id inner join customers on orders.customer_id = customers.customer_id where customers.contact_name like ?"
                );
                query.clearParameters();
                query.setString(1,name + "%");
                ResultSet rs = query.executeQuery();
                while(rs.next()){
                    ProductTo productTo = new ProductTo(rs.getString("product_name"),rs.getInt("unit_price"));
                    productTos.add(productTo);
                }

            }catch (SQLException sqle){
                System.out.println("Connection err: " + sqle);
            }

        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productTos;
    }

}
