package com.hbut.dao;

import com.hbut.domain.Account;

import java.util.List;

public interface AccountDao {
    public void save(Account account);
    public void delete(Account account);
    public void update(Account account);
    public Account getById(Integer id);
    public List<Account> getAllAccount();
}
