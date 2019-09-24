package com.qf.inner;

public  class OuterClass {
    private String username;
    public void method1(){
        System.out.println("out");
    }

    static class  InnerClass{
        public static void method2(){
            System.out.println("inner");
        }
    }

    public static void main(String[] args) {


    }
}
