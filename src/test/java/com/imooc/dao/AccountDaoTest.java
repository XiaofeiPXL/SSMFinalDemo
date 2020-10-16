package com.imooc.dao;

import com.imooc.BaseTest;
import com.imooc.entity.Account;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * @program: SSMFinalDemo
 * @description:
 * @author: Xiaofei Wang
 * @created: 2020/10/15 15:05
 */


public class AccountDaoTest extends BaseTest {

    private AccountDao accountDao;

    @Autowired
    public void setAccountDao(AccountDao accountDao){
        this.accountDao = accountDao;
    }

    @Before
    public void setUp(){
        System.out.println("持久层的测试开始。。。");
    }

    @After
    public void tearDown(){
        System.out.println("持久层的测试结束。。。");
    }

    @Test
    public void save() {
        Account account = new Account();
        account.setId(null);
        account.setName("huahua");
        account.setMoney(500f);
        accountDao.save(account);
    }

    @Test
    public void findAll() {
        List<Account> accountList = accountDao.findAll();
        for(Account account:accountList){
            System.out.println(account);
        }
    }

    @Test
    public void updateAccount() {
        Account account = new Account();
        account.setId(1);
        account.setMoney(100f);
        accountDao.updateAccount(account);
    }

    @Test
    public void findById() {
        System.out.println(accountDao.findById(1));
    }
}