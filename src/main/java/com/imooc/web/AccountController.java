package com.imooc.web;


import com.imooc.entity.Account;
import com.imooc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @program: SSMFinalDemo
 * @description: web层controller
 * @author: Xiaofei Wang
 * @created: 2020/10/15 12:05
 */

@Controller
public class AccountController {

    private AccountService accountService;

    @Autowired
    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }


    @RequestMapping("/testMVC")
    public String testMVC(Model model) {
        List<Account> accountList = accountService.findAll();
        model.addAttribute("list",accountList);
        return "success";
    }
}
