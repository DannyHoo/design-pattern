package com.danny.designpattern.creational.builder.frame;

/**
 * @author huyuyang@lxfintech.com
 * @Title: Client
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-09-14 17:58:13
 */
public class Client {
    public static void main(String[] args) {
        Builder builder=new ConcreteBuilder();
        Director director=new Director(builder);
        Product product=director.construct();

    }
}
