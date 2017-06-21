package com.danny.designpattern.creational.simplefactory.frame;

/**
 * @author huyuyang@lxfintech.com
 * @Title: ProductFactory
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-06-22 00:34:10
 */
public class ProductFactory {

    public static AbstractProduct getProductBySimpleName(String type) {
        if (ProductA.class.getSimpleName().equals(type)) {
            return new ProductA();
        } else if (ProductB.class.getSimpleName().equals(type)) {
            return new ProductB();
        }
        return null;
    }
}
