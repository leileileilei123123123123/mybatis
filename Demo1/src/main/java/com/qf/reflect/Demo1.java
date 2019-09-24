package com.qf.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;

public class Demo1 {
    public static void main(String[] args)throws Exception {
//        User user = new User();
//        Class<? extends User> aClass1 = user.getClass();
//        Class<User> aClass1 = User.class;
        Class aClass = Class.forName("com.qf.reflect.User");
//        获取所有属性
        Field[] fields = aClass.getDeclaredFields();
        for (Field f : fields){
            //System.out.println(f);
        }
//        通过属性名,无论什么权限修饰符
//        Field field = aClass.getDeclaredField("id");
//        System.out.println(field);
//        获取类的权限修饰符0.default  1.public	2.private	4.protected
        //int modifiers = aClass.getModifiers();
        User user = new User();
        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods){
            if (method.getName().equals("method1")){
                method.invoke(user,null);
            }
        }

    }
}
