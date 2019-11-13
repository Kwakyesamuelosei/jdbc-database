package io.turntabl;

import java.util.List;

public interface CustomerDAO {
    List<ProductTo> getCustomerProducts(String name);
    List<ProductTo> get5MostPopularProducts();
    List<SaleTo> getAllSalesbyWeek(String startDate, String endDate);
}
