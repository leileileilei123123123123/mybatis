package com.qf.dao;

//@Transactional(isolation = Isolation.REPEATABLE_READ ,propagation = Propagation.REQUIRED,readOnly = false)
public class AccountServiceImpl implements AccountService {
    AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void change(Integer first, Integer second, Double money) {
        accountDao.increase(first,money);
        System.out.println(1/0);
        accountDao.decrease(second,money);

    }
}
