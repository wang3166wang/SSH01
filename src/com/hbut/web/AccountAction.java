package com.hbut.web;

import com.hbut.domain.Account;
import com.hbut.service.AccountService;
import com.hbut.service.AccountServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;

public class AccountAction extends ActionSupport implements ModelDriven<Account> {

    private Account account = new Account();
    @Override
    public Account getModel() {
        return account;
    }

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    //自动注入
    AccountService accountService;
    public String save(){
        accountService.save(account);
        System.out.println("来到了accountSave的action当中");
            return null;
        }


}
