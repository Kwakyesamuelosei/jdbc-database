package io.turntabl.DAO;

import io.turntabl.Transfers.ProductTo;

import java.util.List;

public interface CustomerDAO {
    public List<ProductTo> getCustomerProducts(String name);
}