package com.danny.designpattern.creational.factory.frame.factory;

import com.danny.designpattern.creational.factory.frame.product.AbstractProduct;

/**
 * @author huyuyang@lxfintech.com
 * @Title: AbstractFactory
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-06-22 22:49:04
 */
public abstract class AbstractFactory {
    public abstract AbstractProduct createProduct();
}
