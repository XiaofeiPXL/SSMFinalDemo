package com.imooc.service;

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
 * @created: 2020/10/15 12:14
 */


public class AccountServiceTest extends BaseTest {

    private AccountService accountService;

    @Autowired
    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Before
    public void setUp() {
        System.out.println("Test is start...");
    }

    @After
    public void tearDown() {
        System.out.println("test is done...");
    }

    @Test
    public void save() {
        Account account = new Account(null, "diandian", 400f);
        accountService.save(account);
    }

    @Test
    public void findAll() {
        List<Account> accountList = accountService.findAll();
        for(Account account:accountList){
            System.out.println(account);
        }
    }

    @Test
    public void transfer() {
        accountService.transfer(100f,2,1);
    }
}