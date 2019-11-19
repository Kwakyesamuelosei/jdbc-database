package io.turntabl.DAO;

import io.turntabl.Transfers.ProductTo;
import io.turntabl.Transfers.SaleTo;

import java.util.List;

public interface CategoryDAO {
    List<ProductTo> getProductsByCategory(String name);
    List<SaleTo> getSalesByCategory(String name);
}
