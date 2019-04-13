package com.hbut.dao;

import com.hbut.domain.Account;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class AccountDaoImpl extends HibernateDaoSupport implements AccountDao{
    @Override
    public void save(Account account) {
        System.out.println("已经来到Dao中 对account表进行添加操作");
        this.getHibernateTemplate().save(account);

    }

    @Override
    public void delete(Account account) {
        this.getHibernateTemplate().delete(account);

    }

    @Override
    public void update(Account account) {
        this.getHibernateTemplate().update(account);

    }

    @Override
    public Account getById(Integer id) {
        Account account = this.getHibernateTemplate().get(Account.class,id);
        return account;
    }


    @Override
    public List<Account> getAllAccount() {
        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Account.class);
        List<Account> list = (List<Account>)this.getHibernateTemplate().findByCriteria(detachedCriteria);
        return list;
    }
}
