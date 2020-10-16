package com.imooc.service.impl;

import com.imooc.dao.AccountDao;
import com.imooc.entity.Account;
import com.imooc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: SSMFinalDemo
 * @description: 业务层实现类
 * @author: Xiaofei Wang
 * @created: 2020/10/15 12:03
 */

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    @Autowired
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void save(Account account) {
        accountDao.save(account);
        System.out.println("保存账户信息完成");
    }

    @Override
    public List<Account> findAll() {
        List<Account> accountList = accountDao.findAll();
        System.out.println("查询所有账户信息完成");
        return accountList;
    }


    @Override
    public void transfer(Float money, Integer sourceId, Integer targetId) {
        Account sourceAccount = accountDao.findById(sourceId);
        Account targetAccount = accountDao.findById(targetId);

        sourceAccount.setMoney(sourceAccount.getMoney() - money);
        targetAccount.setMoney(targetAccount.getMoney() + money);


        accountDao.updateAccount(sourceAccount);
        accountDao.updateAccount(targetAccount);
    }
}
