package com.danny.designpattern.creational.singleton.frame;

/**
 * @author huyuyang@lxfintech.com
 * @Title: Singleton1
 * @Copyright: Copyright (c) 2016
 * @Description: 懒汉模式 线程不安全
 * 这种写法lazy loading很明显，但是致命的是在多线程不能正常工作。
 * @Company: lxjr.com
 * @Created on 2017-06-24 13:58:30
 */
public class Singleton1{
    private static Singleton1 singleton1;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (singleton1 == null) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }
}
