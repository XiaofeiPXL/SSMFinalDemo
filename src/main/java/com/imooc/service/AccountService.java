package com.imooc.service;

import com.imooc.entity.Account;

import java.util.List;

/**
 * @program: SSMFinalDemo
 * @description: 业务层接口
 * @author: Xiaofei Wang
 * @created: 2020/10/15 12:02
 */


public interface AccountService {
    /**
     * 保存账户
     * @param account 账户对象
     */
    void save(Account account);

    /**
     * 查询所有账户
     * @return 对应的账户对象列表
     */
    List<Account> findAll();

    /**
     * 转账
     * @param money 转出金额
     * @param sourceId 转出账户id
     * @param targetId 转入账户id
     */
    void transfer(Float money,Integer sourceId,Integer targetId);
}
