package io.turntabl.DAO;

import io.turntabl.Transfers.ProductTo;

import java.util.List;

public interface ProductDAO {
    List<ProductTo> get5MostPopularProducts();
}
