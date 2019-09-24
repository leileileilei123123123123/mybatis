package com.qf.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao{
    @Override
    public void increase(Integer id, Double money) {
        getJdbcTemplate().update("update account set money = money + ? where id =?",money,id);
    }

    @Override
    public void decrease(Integer id, Double money) {
        getJdbcTemplate().update("update account set money= money - ? where id = ?",money,id);
    }
}
