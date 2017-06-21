package com.danny.designpattern.creational.simplefactory.frame;

/**
 * @author huyuyang@lxfintech.com
 * @Title: Client
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-06-22 00:36:28
 */
public class Client {
    public static void main(String[] args) {
        System.out.println(ProductA.class.getSimpleName());
        AbstractProduct product=ProductFactory.getProduct(ProductA.class.getSimpleName());
    }
}
