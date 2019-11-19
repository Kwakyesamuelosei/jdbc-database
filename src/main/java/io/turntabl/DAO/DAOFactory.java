package io.turntabl.DAO;

import io.turntabl.Implementors.ProductDAOImpl;
import io.turntabl.Implementors.SalesDAOImpl;

public interface DAOFactory {
    public ProductDAO getCustomerDao();
    public ProductDAOImpl getProductDAO();
    public SalesDAOImpl getSalesDAO();
    public CategoryDAO getCategoryDAO();
}
