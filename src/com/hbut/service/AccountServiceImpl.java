package com.hbut.service;

import com.hbut.dao.AccountDao;
import com.hbut.domain.Account;

public class AccountServiceImpl implements AccountService{

    /*注入Dao*/
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void save(Account account) {
        System.out.println("已经来到实现AccountSave的方法"+account);
        accountDao.save(account);
    }
}
