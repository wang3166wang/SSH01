package com.hbut.dao;

import com.hbut.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")

public class AccountDaoTest {

    @Resource(name = "accountDao")
    private AccountDao accountDao;

    @Test
    public void getById(){
        Account account = accountDao.getById(3);
        System.out.println(account);
    }
    @Test
    public void getAllAccount(){
        List<Account> allAccount = accountDao.getAllAccount();
        for (Account account:allAccount) {
            System.out.println(account);
            
        }
    }
    @Test
    public void insert(){
        Account account = accountDao.getById(1);
        account.setName("ÀÔ“ª");
        account.setMoney(1314d);
        accountDao.update(account);
    }
    @Test
    public void delete(){
        Account account = accountDao.getById(7);
        accountDao.delete(account);
    }


}
