package com.qf.dao;

public interface AccountDao {
    public void increase(Integer id, Double money);
    public void decrease(Integer id, Double money);
}
