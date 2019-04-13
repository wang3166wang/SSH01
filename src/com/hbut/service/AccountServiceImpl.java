package com.hbut.service;

import com.hbut.dao.AccountDao;
import com.hbut.domain.Account;

public class AccountServiceImpl implements AccountService{

    /*ע��Dao*/
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void save(Account account) {
        System.out.println("�Ѿ�����ʵ��AccountSave�ķ���"+account);
        accountDao.save(account);
    }
}
