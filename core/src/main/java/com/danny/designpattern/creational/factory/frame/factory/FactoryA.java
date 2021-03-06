package com.danny.designpattern.creational.factory.frame.factory;

import com.danny.designpattern.creational.factory.frame.product.AbstractProduct;
import com.danny.designpattern.creational.factory.frame.product.ProductA;

/**
 * @author huyuyang@lxfintech.com
 * @Title: FactoryA
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-06-22 22:49:16
 */
public class FactoryA extends AbstractFactory {
    public AbstractProduct createProduct() {
        return new ProductA();
    }
}
