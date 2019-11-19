package io.turntabl.DAO;

import io.turntabl.Transfers.SaleTo;

import java.util.List;

public interface SalesDAO {
    public List<SaleTo> getAllSalesbyWeek(String startDate, String endDate);
}
