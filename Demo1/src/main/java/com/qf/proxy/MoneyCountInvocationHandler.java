package com.qf.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MoneyCountInvocationHandler implements InvocationHandler {
    private final Object target;
    private Double moneyCount;

    public  MoneyCountInvocationHandler(Object target) {
        this.target = target;
        this.moneyCount = 0.0;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(target, args);
        moneyCount += 0.07;
        System.out.println("发短信成功，共花了：" + moneyCount +"元");
        return result;
    }
}
