package com.qf.inner;

public class Dog  {
    private Integer age;
    public void method(){
        Animal dog = new Animal() {
            public void eat() {
                System.out.println("狗在吃");
            }
        };//.eat();
        dog.eat();
    }
//    第三种执行，把接口类作为参数，调用方法时执行，
    public void method2(Animal animal){
        animal.eat();
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.method2(new Animal() {
            public void eat() {
                System.out.println("狗在吃2");
            }
        });
    }
}
