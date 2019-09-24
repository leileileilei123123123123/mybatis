package com.qf.proxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

public class Demo1 {
    public static void main(String[] args) {
        SMSService smsService = new SMSServiceImpl();
        smsService=(SMSService)Proxy.newProxyInstance(Demo1.class.getClassLoader(),
                new Class[]{SMSService.class},
                new MoneyCountInvocationHandler(smsService));
        smsService.sendMessage();
        smsService.sendMessage();
    }
    @Test
    public void test1(){
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao proxy = new UserDaoProxy(userDao).createProxy();
        proxy.add();
        proxy.update();
    }
}
