package com.imooc.dao;

import com.imooc.entity.Account;

import java.util.List;

/**
 * @program: SSMFinalDemo
 * @description: 持久层接口
 * @author: Xiaofei Wang
 * @created: 2020/10/15 11:58
 */

public interface AccountDao {
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
     * 更新账户
     * @param account 账户对象
     */
    void updateAccount(Account account);

    /**
     * 根据账户id查询账户
     * @param id 账户id
     * @return 对应的账户
     */
    Account findById(Integer id);
}
