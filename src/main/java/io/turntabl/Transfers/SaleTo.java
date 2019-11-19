package io.turntabl.Transfers;

public class SaleTo {
    private String product_name;
    private String customer_name;

    public SaleTo(String product_name, String customer_name) {
        this.product_name = product_name;
        this.customer_name = customer_name;
    }

    public String getProduct_name() {
        return product_name;
    }

    @Override
    public String toString() {
        return "{" +
                "product_name='" + product_name + '\'' +
                ", customer_name='" + customer_name + '\'' +
                '}';
    }

    public String getCustomer_name() {
        return customer_name;
    }
}
