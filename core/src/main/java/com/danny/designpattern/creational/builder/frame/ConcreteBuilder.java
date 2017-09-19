package com.danny.designpattern.creational.builder.frame;

/**
 * @author huyuyang@lxfintech.com
 * @Title: ConcreteBuilder
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-09-14 17:55:13
 */
public class ConcreteBuilder extends Builder {
    public void buildPartA() {
        product.setPartA("");
        System.out.println("buildPartA");
    }

    public void buildPartB() {
        product.setPartB("buildPartB");
        System.out.println("buildPartB");
    }

    public void buildPartC() {
        product.setPartC("buildPartC");
        System.out.println("buildPartC");
    }
}
