package com.imooc;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: SSMFinalDemo
 * @description: 集成JUnit的基础测试类
 * @author: Xiaofei Wang
 * @created: 2020/10/15 15:05
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class BaseTest {
}
