package com.qf.proxy;

import com.qf.dao.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo2 {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService contextBean = (AccountService)context.getBean("accountService");
        contextBean.change(1,2,100d);
    }
}
