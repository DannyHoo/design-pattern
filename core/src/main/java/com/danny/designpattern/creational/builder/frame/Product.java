package com.danny.designpattern.creational.builder.frame;

/**
 * @author huyuyang@lxfintech.com
 * @Title: Product
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-09-14 17:53:11
 * 需要被创建的复杂对象
 */
public class Product {
    private String partA;
    private String partB;
    private String partC;

    public String getPartA() {
        return partA;
    }

    public Product setPartA(String partA) {
        this.partA = partA;
        return this;
    }

    public String getPartB() {
        return partB;
    }

    public Product setPartB(String partB) {
        this.partB = partB;
        return this;
    }

    public String getPartC() {
        return partC;
    }

    public Product setPartC(String partC) {
        this.partC = partC;
        return this;
    }
}
