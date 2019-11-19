package io.turntabl.Transfers;

public class ProductTo {
    private String product_name;
    private Integer price;

    public ProductTo( String product_name, Integer price) {
        this.product_name = product_name;
        this.price = price;
    }

    public String getProduct_name() {
        return product_name;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "{" +
                "product_name='" + product_name + '\'' +
                ", price=" + price +
                '}';
    }
}
