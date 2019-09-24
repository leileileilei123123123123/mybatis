package com.qf.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk的动态代理生成
 */
public class UserDaoProxy implements InvocationHandler {
   private UserDao userDao;
   public UserDaoProxy(UserDao userDao){
       super();
       this.userDao = userDao;
   }
   public UserDao createProxy(){
       UserDao proxy = (UserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(),
               userDao.getClass().getInterfaces(),
               this);
       return proxy;
   }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if("add".equals(method.getName())){
            //记录日志
            System.out.println("记录日志");
            Object result = method.invoke(userDao, args);
            return result;
        }
        return method.invoke(userDao,args);
    }
}
