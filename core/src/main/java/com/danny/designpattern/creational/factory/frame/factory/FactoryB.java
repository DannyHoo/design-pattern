package com.danny.designpattern.creational.factory.frame.factory;

import com.danny.designpattern.creational.factory.frame.product.AbstractProduct;
import com.danny.designpattern.creational.factory.frame.product.ProductB;

/**
 * @author huyuyang@lxfintech.com
 * @Title: FactoryB
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-06-22 22:49:25
 */
public class FactoryB extends AbstractFactory {
    public AbstractProduct createProduct() {
        return new ProductB();
    }
}
